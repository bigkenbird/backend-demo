/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.service;

import com.feib.demo.controller.rq.LoginRq;
import com.feib.demo.controller.rs.LoginRs;
import com.feib.demo.model.Menu;
import com.feib.demo.persistence.entity.MenuEntity;
import com.feib.demo.persistence.entity.SystemUserEntity;
import com.feib.demo.persistence.repository.MenuRepository;
import com.feib.demo.persistence.repository.SystemUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;


/**
 * <p>
 * 登入服務
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月10日
 */
@Service
@RequiredArgsConstructor
public class LoginService {

    private final SystemUserRepository systemUserRepository;

    private final MenuRepository menuRepository;


    public LoginRs login(LoginRq loginRq) {

        LoginRs loginRs = new LoginRs();

        String account = loginRq.getAccount();
        String password = loginRq.getPassword();

        List<SystemUserEntity> users = systemUserRepository.findByAccount(account);

        if(isEmpty(users)) {
            loginRs.setIsLogin(false);
            return loginRs;
        }

        SystemUserEntity userEntity = users.get(0);

        if(!password.equals(userEntity.getPassword())) {
            loginRs.setIsLogin(false);
            return loginRs;
        }

        loginRs.setIsLogin(true);

        String authority = userEntity.getAuthority();

        List<Menu> resultMenus;

        if("admin".equals(authority)){
            List<MenuEntity> allMainMenuInDb = menuRepository.findByParentIdAndDisabled(0,true);
            resultMenus = allMainMenuInDb.stream().map(this::tranDbToView).toList();
        }
        else {
            List<MenuEntity> oneMainMenuInDb = menuRepository.findByParentIdAndDisabled(1,true);
            resultMenus = oneMainMenuInDb.stream().map(this::tranDbToView).toList();
        }

        loginRs.setMenuList(resultMenus);
        return loginRs;
    }

    private Menu tranDbToView(MenuEntity menuEntity) {
        Menu menu = new Menu();
        if(menuEntity.isDisabled()){
            menu.setLabel(menuEntity.getLabel());
            menu.setMenuIxd(menuEntity.getMenuIxd());
            menu.setOrder(menuEntity.getSort());
            menu.setUrl(menuEntity.getUrl());
            menu.setSub(getSubMenuList(menuEntity));
        }
        return menu;
    }

    private List<Menu> getSubMenuList(MenuEntity menuEntity) {
        List<MenuEntity> subMenuList = menuRepository.findByParentId(menuEntity.getId());

        return CollectionUtils.isEmpty(subMenuList) ?
                null:
                subMenuList.stream().map(this::tranDbToView).toList();
    }
}

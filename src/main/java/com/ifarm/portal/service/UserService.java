package com.ifarm.portal.service;

import com.ifarm.domin.TbUser;

public interface UserService {

	TbUser getUserByToken(String token);
}

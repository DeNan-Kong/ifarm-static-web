package com.ifarm.portal.service;

import com.ifarm.common.pojo.IfarmResult;
import com.ifarm.portal.pojo.CartItem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface CartService {

	IfarmResult addCartItem(long itemId, int num, HttpServletRequest request, HttpServletResponse response);
	List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response);
	IfarmResult deleteCartItem(long itemId, HttpServletRequest request, HttpServletResponse response);
}

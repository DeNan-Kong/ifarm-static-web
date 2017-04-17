package com.ifarm.portal.service;

import com.ifarm.portal.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page);
}

package org.metadatacenter.server.security;

import org.metadatacenter.server.security.exception.CedarAccessException;
import org.metadatacenter.server.security.model.IAuthRequest;
import org.metadatacenter.server.security.model.auth.CedarPermission;
import org.metadatacenter.server.security.model.user.CedarUser;


public interface IAuthorizationResolver {

  void mustHavePermission(IAuthRequest request, CedarPermission permission, IUserService userService) throws
      CedarAccessException;

  CedarUser getAccountInfo(IAuthRequest authRequest) throws CedarAccessException;

}
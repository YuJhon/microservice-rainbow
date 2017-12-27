package com.jhon.rain.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>功能描述</br>接口权限过滤器配置</p>
 *
 * @author jiangy19
 * @projectName ms-rainbow
 * @date 2017/12/26 19:45
 */
@Slf4j
public class MsRainbowAccessFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return "pre";
  }

  @Override
  public int filterOrder() {
    return 0;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();

    log.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

    Object accessToken = request.getParameter("accessToken");
    if (accessToken == null) {
      log.warn("access token is empty");
      ctx.setSendZuulResponse(false);
      ctx.setResponseStatusCode(401);
      return null;
    }
    log.info("access token ok");
    return null;
  }
}

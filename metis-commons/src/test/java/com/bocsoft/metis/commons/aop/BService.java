package com.bocsoft.metis.commons.aop;

import org.springframework.stereotype.Service;
import org.suw.learn.metis.commons.log.annotation.BusiLog;

/**
 * Created by zion on 11/21/14.
 */
@Service
public class BService {

  @BusiLog
  public String getB() {
    return "NB";
  }
}

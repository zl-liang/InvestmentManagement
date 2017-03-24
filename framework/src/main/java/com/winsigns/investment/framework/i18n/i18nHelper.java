package com.winsigns.investment.framework.i18n;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * Created by colin on 2017/2/23.
 */

public class i18nHelper {

  protected static MessageSource messageSource;

  private i18nHelper() {}

  public static String i18n(String resourceKey) {
    Locale locale = LocaleContextHolder.getLocale();
    return messageSource.getMessage(resourceKey, null, locale);
  }

  public static String i18n(Enum<?> literal) {
    String resourceKey = literal.getClass().getSimpleName() + "." + literal.toString();
    return i18n(resourceKey);
  }
}

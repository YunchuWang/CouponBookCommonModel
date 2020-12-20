package com.couponbook.model;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Coupon {

  public abstract boolean hasToken();

  public abstract String merchantId();

  public abstract String title();

  public abstract String url();

  public abstract Long volume();

  public abstract String description();

  public abstract String expirationTimestamp();

  public abstract String createdTimestamp();

}

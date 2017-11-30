
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/Library Manager/conf/routes
// @DATE:Tue Nov 28 17:17:25 CST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseManager Manager = new controllers.ReverseManager(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUser User = new controllers.ReverseUser(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseManager Manager = new controllers.javascript.ReverseManager(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUser User = new controllers.javascript.ReverseUser(RoutesPrefix.byNamePrefix());
  }

}

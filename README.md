## Touchy Typesafe Config - Support for Config by Typesafe in Touchy

### Include in project
This project can be found in Maven Central Repository. For example to include it in gradle project add following
dependency:

      'com.github.sursmobil:touchy-typesafe-config:0.1.0'

### Usage
This library adds new plugin to Touchy which will be loaded by default. As of version 0.1.0 this plugin includes
single ValueSource: TypesafeConfig, which allow config to be used from Touchy. TypesafeConfig load Config using
``ConfigFactory.load()``. Property name in Source annotation should be given as absolute property path. Example
Touchy config using this plugin could look like following:

      public abstract class ServerConfig {

          @Source(type = TypesafeConfig.class, property = "myapp.server.host", priority = 1)
          public String getHost() {
            return "localhost"
          }

          @Source(type = TypesafeConfig.class, property = "myapp.server.port", priority = 1)
          int getPort();

      }

and configuration in application.conf used by this implementation:

      myapp {
          server{
              host = "127.0.0.1"
              port = 1234
          }
      }
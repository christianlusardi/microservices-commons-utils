[![](https://img.shields.io/travis/gradasso/microservices-commons-utils.svg?branch=master)](https://travis-ci.org/gradasso/microservices-commons-utils)
[![](https://img.shields.io/github/license/gradasso/microservices-commons-utils.svg)](./LICENSE)

# Microservices Commons Utils

A minimal lightweight library to support develop microservices in java

Getting started
---------------
​

```xml
<dependency>
    <groupId>it.christianlusardi</groupId>
    <artifactId>mcu</artifactId>
    <version>1.0.0</version>
</dependency>
```

​
```java

import it.christianlusardi.mcu.core.Mcu;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            Mcu.start();
            // continue with your logic...
	} catch (McuStartupException e) {
	    // somenthing were wrong...
	}
    }
}
```

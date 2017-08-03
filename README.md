# java-logback-pro

Professional logging via Logback in Java.

A simple project to demonstrate conditional logging using Logback, the Groovy scripting language for logging
configuration, and JMX over HTTP via Jolokia in order to expose runtime tweaking to the JVM process.

## Running

To build and run the JAR:

```
$ mvn -DskipTests package
$ DEPLOY_ENVIRONMENT=dev LOG_FORMAT=plain \
    java -jar target/logback-pro-0.1.0.jar
```

It will simply log at every level in a while loop forever.

## Environment Variables

As seen in `src/main/resources/logback.groovy`, the logging configuration respects a number of environment variables:

<dl>
  <dt><code>DEPLOY_ENVIRONMENT</code></dt>
  <dd>Either <code>production</code>/<code>prod</code>, <code>staging</code>/<code>stg</code>, or
      <code>development</code>/<code>dev</code>.</dd>
  <dt><code>SYSLOG_TARGET</code></dt>
  <dd>A target endpoint to send syslog traffic to, defaults to <code>127.0.0.1</code>.</dd>
  <dt><code>LOG_FORMAT</code></dt>
  <dd>Either <code>plain</code> or <code>json</code> for different output types.</dd>
</dl>

## License

MIT

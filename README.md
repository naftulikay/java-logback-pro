# java-logback-pro

Professional logging via Logback in Java.

A simple project to demonstrate conditional logging using Logback, the Groovy scripting language for logging
configuration, and JMX over HTTP via Jolokia in order to expose runtime tweaking to the JVM process.

## Running

To build a distribution:

```
$ mvn -DskipTests package
```

Next, unzip, untar, or change into the `target/logback-pro-${VERSION}-dist/logback-pro-${VERSION}` directory.

Finally, start the service via the supplied shell script:

```
$ LOG_FORMAT=json bin/logback-pro
{"@timestamp":"2017-08-04T15:30:33.325+00:00","@version":1,"message":"A debug statement.","logger_name":"wtf.naftuli.logbackpro.LogbackPro","thread_name":"main","level":"DEBUG","level_value":10000}
{"@timestamp":"2017-08-04T15:30:33.332+00:00","@version":1,"message":"An info statement.","logger_name":"wtf.naftuli.logbackpro.LogbackPro","thread_name":"main","level":"INFO","level_value":20000}
{"@timestamp":"2017-08-04T15:30:33.333+00:00","@version":1,"message":"A warning.","logger_name":"wtf.naftuli.logbackpro.LogbackPro","thread_name":"main","level":"WARN","level_value":30000}
{"@timestamp":"2017-08-04T15:30:33.333+00:00","@version":1,"message":"An error.","logger_name":"wtf.naftuli.logbackpro.LogbackPro","thread_name":"main","level":"ERROR","level_value":40000}
```

It will simply attempt to log at every level in a while loop forever.

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

Set these environment variables when invoking the script and they will

## License

MIT

# SPT Checkstyle

[![circleci](https://img.shields.io/badge/circleci-spt--checkstyle-brightgreen.svg)](https://circleci.com/gh/spt-oss/spt-checkstyle)
[![maven central](https://img.shields.io/badge/maven_central-spt--checkstyle-blue.svg)](https://mvnrepository.com/artifact/com.github.spt-oss/spt-checkstyle)

* Checkstyle configuration for SPT Java Style

## Usage

### IDE

* Checkout the repository and import configuration into your IDE.

	```bash
	spt-checkstyle/src/main/resources/spt/checkstyle/checks.xml
	```

### Maven

* Add a dependency in your POM.

	```xml
	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-checkstyle-plugin</artifactId>
		<configuration>
			<configLocation>spt/checkstyle/checks.xml</configLocation>
		</configuration>
		<dependencies>
			<dependency>
				<groupId>com.puppycrawl.tools</groupId>
				<artifactId>checkstyle</artifactId>
				<version>8.12</version>
			</dependency>
			<dependency>
				<groupId>com.github.spt-oss</groupId>
				<artifactId>spt-checkstyle</artifactId>
				<version>8.12.0</version>
			</dependency>
		</dependencies>
	</plugin>
	```

## License

* This software is released under the Apache License 2.0.

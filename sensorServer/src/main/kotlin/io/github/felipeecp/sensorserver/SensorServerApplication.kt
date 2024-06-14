package io.github.felipeecp.sensorserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SensorServerApplication

fun main(args: Array<String>) {
	runApplication<SensorServerApplication>(*args)
}

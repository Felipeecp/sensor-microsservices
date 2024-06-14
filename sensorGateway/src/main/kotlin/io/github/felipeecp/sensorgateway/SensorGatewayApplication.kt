package io.github.felipeecp.sensorgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder

@SpringBootApplication
class SensorGatewayApplication

fun main(args: Array<String>) {
	runApplication<SensorGatewayApplication>(*args)
}
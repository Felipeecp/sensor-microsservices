package io.github.felipeecp.sensorgateway

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GatewayConfig {

    @Bean
    fun routes(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes()
            .route("cadastros-sensor") {
                r -> r.path("/sensors/**")
                .uri("lb://cadastrosensores")
            }
            .route("data_service"){
                r -> r.path("/sensor-data/**")
                .uri("lb://DATA-SERVICE")
            }
            .build()
    }

}
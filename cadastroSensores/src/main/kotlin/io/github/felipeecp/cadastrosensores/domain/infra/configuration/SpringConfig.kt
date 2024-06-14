package io.github.felipeecp.cadastrosensores.domain.infra.configuration

import io.github.felipeecp.cadastrosensores.domain.application.usercase.CreateSensorUseCase
import io.github.felipeecp.cadastrosensores.domain.application.usercase.DeleteSensorUseCase
import io.github.felipeecp.cadastrosensores.domain.application.usercase.GetAllSensorsUseCase
import io.github.felipeecp.cadastrosensores.domain.application.usercase.UpdateSensorUseCase
import io.github.felipeecp.cadastrosensores.domain.repository.SensorRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringConfig {

    @Bean
    fun createSensorUseCase(sensorRepository: SensorRepository):CreateSensorUseCase {
        return CreateSensorUseCase(sensorRepository)
    }

    @Bean
    fun updateSensorUseCase(sensorRepository: SensorRepository):UpdateSensorUseCase {
        return UpdateSensorUseCase(sensorRepository)
    }

    @Bean
    fun getAllSensorsUseCase(sensorRepository: SensorRepository): GetAllSensorsUseCase {
        return GetAllSensorsUseCase(sensorRepository)
    }

    @Bean
    fun deleteSensorUseCase(sensorRepository: SensorRepository): DeleteSensorUseCase {
        return DeleteSensorUseCase(sensorRepository)
    }

}
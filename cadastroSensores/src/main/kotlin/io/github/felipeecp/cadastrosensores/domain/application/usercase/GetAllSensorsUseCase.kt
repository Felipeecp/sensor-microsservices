package io.github.felipeecp.cadastrosensores.domain.application.usercase

import io.github.felipeecp.cadastrosensores.domain.model.Sensor
import io.github.felipeecp.cadastrosensores.domain.repository.SensorRepository

class GetAllSensorsUseCase(private val sensorRepository: SensorRepository) {

    fun execute(): List<Sensor>{
        return sensorRepository.findAll()
    }

}
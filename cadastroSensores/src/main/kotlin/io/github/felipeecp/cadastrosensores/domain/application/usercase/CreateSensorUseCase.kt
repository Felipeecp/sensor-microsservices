package io.github.felipeecp.cadastrosensores.domain.application.usercase

import io.github.felipeecp.cadastrosensores.domain.model.Sensor
import io.github.felipeecp.cadastrosensores.domain.repository.SensorRepository

class CreateSensorUseCase(private val sensorRepository: SensorRepository) {

    fun execute(sensor:Sensor): Sensor {
        if(sensorRepository.findByName(sensor.name).isPresent){
            throw IllegalArgumentException("Sensor ${sensor.name} já foi cadastrado")
        }
        return sensorRepository.save(sensor)
    }
}
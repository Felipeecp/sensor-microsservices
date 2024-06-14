package io.github.felipeecp.cadastrosensores.domain.application.usercase

import io.github.felipeecp.cadastrosensores.domain.model.Sensor
import io.github.felipeecp.cadastrosensores.domain.repository.SensorRepository

class UpdateSensorUseCase(private val sensorRepository: SensorRepository) {
    fun execute(id: String, sensor: Sensor) : Sensor? {
        val existingSensor = sensorRepository.findById(id).orElse(null) ?: return null
        val updatedSensor = existingSensor.copy(
            name = sensor.name,
            type = sensor.type,
            location = sensor.location,
            description = sensor.description,
            installationDate = sensor.installationDate,
            lastMaintaneDate = sensor.lastMaintaneDate,
            modelName = sensor.modelName,
            status = sensor.status,
        )
        return sensorRepository.save(updatedSensor)
    }
}
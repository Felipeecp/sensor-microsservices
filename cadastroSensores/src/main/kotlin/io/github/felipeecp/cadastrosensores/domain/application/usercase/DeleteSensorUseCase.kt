package io.github.felipeecp.cadastrosensores.domain.application.usercase

import io.github.felipeecp.cadastrosensores.domain.repository.SensorRepository
import java.util.*


class DeleteSensorUseCase(private val sensorRepository: SensorRepository) {

    fun execute(id: String):Boolean{
        return if(sensorRepository.existsById(id)){
            sensorRepository.deleteById(id)
            true
        }else{
            false
        }
    }

}
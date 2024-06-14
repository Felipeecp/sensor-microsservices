package io.github.felipeecp.cadastrosensores.domain.repository

import io.github.felipeecp.cadastrosensores.domain.model.Sensor
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

interface SensorRepository {
    fun save(sensor: Sensor):Sensor
    fun findById(id: String): Optional<Sensor>
    fun findByName(name:String):Optional<Sensor>
    fun findAll(): List<Sensor>
    fun deleteById(id: String)
    fun existsById(id: String): Boolean
}
package io.github.felipeecp.cadastrosensores.domain.infra.controller

import io.github.felipeecp.cadastrosensores.domain.application.usercase.CreateSensorUseCase
import io.github.felipeecp.cadastrosensores.domain.application.usercase.DeleteSensorUseCase
import io.github.felipeecp.cadastrosensores.domain.application.usercase.GetAllSensorsUseCase
import io.github.felipeecp.cadastrosensores.domain.application.usercase.UpdateSensorUseCase
import io.github.felipeecp.cadastrosensores.domain.model.Sensor
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sensors")
class SensoresController(
    private val createSensorUseCase: CreateSensorUseCase,
    private val updateSensorUseCase: UpdateSensorUseCase,
    private val deleteSensorUseCase: DeleteSensorUseCase,
    private val getAllSensorsUseCase: GetAllSensorsUseCase
) {

    @GetMapping("ok")
    fun ok():String{
        return "ok"
    }

    @PostMapping
    fun createSensor(@Valid @RequestBody sensor: Sensor): ResponseEntity<Sensor> {
        val createdSensor = createSensorUseCase.execute(sensor)
        return ResponseEntity(createdSensor, HttpStatus.CREATED)
    }

    @GetMapping
    fun getAllSensors(): ResponseEntity<List<Sensor>>{
        val sensors = getAllSensorsUseCase.execute()
        return ResponseEntity.ok(sensors)
    }

    @PutMapping("/{id}")
    fun updateSensor(@PathVariable id:String,@Valid @RequestBody sensor: Sensor): ResponseEntity<Sensor> {
        val updatedSensor = updateSensorUseCase.execute(id, sensor)
        return if(updatedSensor!=null) ResponseEntity(updatedSensor, HttpStatus.OK) else ResponseEntity.notFound().build()
    }

    @DeleteMapping("/{id}")
    fun deleteSensor(@PathVariable id:String): ResponseEntity<Sensor> {
        val isDeleted = deleteSensorUseCase.execute(id)
        return if(isDeleted) ResponseEntity.noContent().build() else ResponseEntity.notFound().build()
    }

}
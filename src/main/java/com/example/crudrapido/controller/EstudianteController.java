package com.example.crudrapido.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.crudrapido.entidades.EstudianteEntidad;
import com.example.crudrapido.service.StudentService;

import java.util.List;

@RestController
@RequestMapping(path = EstudianteController.BASE_PATH) // Usamos la constante BASE_PATH
public class EstudianteController {

    // Definir la ruta base como una constante
    public static final String BASE_PATH = "/api/estudiantes";  // Aquí se puede modificar si es necesario

    @Autowired
    StudentService studentService;

    @GetMapping("/inicio")
    public String bienvenido(HttpServletRequest request) {

        System.out.println("¡Hola desde Spring Boot!");
        System.out.println("¡Hola desde Spring Boot!");

        String urlAplicacion = request.getScheme() + "://" + request.getServerName()
                + ":" + request.getServerPort();  // Siempre usa el puerto sin filtrar

        // Usamos la constante BASE_PATH para construir las rutas
        return "<h2>Bienvenido al backend </h2>"
                + "<p>Explora los siguientes endpoints para interactuar con la API:</p>"

                + " <br><br> <br><hr>"
                + "<strong>1. Obtener todos los estudiantes (GET):</strong><br>"
                + "   Ruta: <code>" + BASE_PATH + "/obtenerEstudiantes</code><br>"
                + "   Descripción: Este endpoint te devuelve la lista de todos los estudiantes registrados.<br>"
                + "   En Postman:<br>"
                + "     Método: GET<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/obtenerEstudiantes\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/obtenerEstudiantes</a><br>"
                + " <br> <hr>"

                + "<strong>2. Guardar un nuevo estudiante (POST):</strong><br>"
                + "   Ruta: <code>" + BASE_PATH + "/guardarEstudiante</code><br>"
                + "   Descripción: Usa este endpoint para guardar un nuevo estudiante.<br>"
                + "   En Postman:<br>"
                + "     Método: POST<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/guardarEstudiante\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/guardarEstudiante</a><br>"
                + "     En el cuerpo (Body) de la solicitud, usa JSON con los datos del estudiante:<br>"
                + "<pre>{<br>"
                + "  \"email\": \"juan.perez@example.com\",<br>"
                + "  \"firstName\": \"Juan\",<br>"
                + "  \"lastName\": \"Pérez\"<br>"
                + "}</pre><br>"
                + " <br> <hr>"

                + "<strong>3. Obtener un estudiante por ID (GET):</strong><br>"
                + "   Ruta: <code>" + BASE_PATH + "/obtenerEstudiante/id</code><br>"
                + "   Descripción: Obtén los datos de un estudiante específico usando su ID.<br>"
                + "   En Postman:<br>"
                + "     Método: GET<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/obtenerEstudiante/id\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/obtenerEstudiante/{id}</a><br>"
                + "     Reemplaza <code>id</code> con el ID del estudiante que deseas consultar.<br>"
                + "     Ejemplo: <a href=\"" + urlAplicacion + BASE_PATH + "/obtenerEstudiante/443\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/obtenerEstudiante/443</a><br>"
                + " <br> <hr>"

                + "<strong>4. Eliminar un estudiante (DELETE):</strong><br>"
                + "   Ruta: <code>" + BASE_PATH + "/id</code><br>"
                + "   Descripción: Elimina un estudiante utilizando su ID.<br>"
                + "   En Postman:<br>"
                + "     Método: DELETE<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/id\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/id</a><br>"
                + "     Reemplaza <code>id</code> con el ID del estudiante que deseas eliminar.<br>"
                + "     Ejemplo: <a href=\"" + urlAplicacion + BASE_PATH + "/443\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/443</a><br>"

                + " <br> <hr>"

                + "<strong>5. Actualizar un estudiante (PUT):</strong><br>"
                + "   Ruta: <code>" + BASE_PATH + "/actualizarEstudiante/id</code><br>"
                + "   Descripción: Actualiza la información de un estudiante usando su ID.<br>"
                + "   En Postman:<br>"
                + "     Método: PUT<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/actualizarEstudiante/id\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/actualizarEstudiante/{id}</a><br>"
                + "     Reemplaza <code>id</code> con el ID del estudiante que deseas actualizar.<br>"
                + "     Ejemplo: <a href=\"" + urlAplicacion + BASE_PATH + "/actualizarEstudiante/443\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/actualizarEstudiante/443</a><br>"
                + "     En el cuerpo (Body) de la solicitud, usa JSON con los nuevos datos del estudiante:<br>"
                + "<pre>{<br>"
                + "  \"email\": \"juan.perez@example.com\",<br>"
                + "  \"firstName\": \"Juan\",<br>"
                + "  \"lastName\": \"Pérez\"<br>"
                + "}</pre><br>"
                + " <br> <hr>"

                + "<p>Servidor ejecutándose en <a href=\"" + urlAplicacion + "\" target=\"_blank\">" + urlAplicacion + "</a>.</p>";
    }

    // POST: guardar un estudiante
    @PostMapping("/guardarEstudiante")
    public EstudianteEntidad save(@RequestBody EstudianteEntidad nuevoEstudiante) {
        studentService.saveEstudiante(nuevoEstudiante); // Guarda el estudiante
        return nuevoEstudiante;
    }

    // GET: obtener todos los estudiantes
    @GetMapping("/obtenerEstudiantes")
    public List<EstudianteEntidad> getEstudiantes() {
        return studentService.getEstudianteTodos(); // Retorna todos los estudiantes
    }

    // GET: obtener un estudiante por su ID
    @GetMapping("/obtenerEstudiante/{id}")
    public EstudianteEntidad getEstudianteById(@PathVariable Long id) {
        return studentService.getEstudiante(id).orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
    }

    // DELETE: eliminar un estudiante por su ID
    @DeleteMapping("/{id}")
    public void deleteEstudiante(@PathVariable Long id) {
        studentService.deleteEstudiante(id); // Elimina el estudiante
    }

    // PUT: actualizar un estudiante
    @PutMapping("/actualizarEstudiante/{id}")
    public EstudianteEntidad actualizarEstudiante(@PathVariable Long id, @RequestBody EstudianteEntidad estudianteActualizado) {
        // Verificamos si el estudiante existe
        EstudianteEntidad estudianteExistente = studentService.getEstudiante(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        // Actualizamos los campos del estudiante existente con los datos proporcionados
        estudianteExistente.setEmail(estudianteActualizado.getEmail());
        estudianteExistente.setFirstName(estudianteActualizado.getFirstName());
        estudianteExistente.setLastName(estudianteActualizado.getLastName());

        // Guardamos el estudiante actualizado
        studentService.saveEstudiante(estudianteExistente);

        return estudianteExistente; // Retornamos el estudiante actualizado
    }
}

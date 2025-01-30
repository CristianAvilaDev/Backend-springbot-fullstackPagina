package com.example.crudrapido.controller;



import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.crudrapido.entiti.estudiante;
import com.example.crudrapido.service.studentService;




import java.util.List;

@RestController
@RequestMapping(path = estudianteController.BASE_PATH) // Usamos la constante BASE_PATH
public class estudianteController {

    // Definir la ruta base como una constante
    public static final String BASE_PATH = "/api/estudiantes";  // Aquí se puede modificar si es necesario

    @Autowired
    studentService studentService;

    @GetMapping("/inicio")
    public String bienvenido(HttpServletRequest request) {
        String urlAplicacion = request.getScheme() + "://" + request.getServerName()
                + ":" + request.getServerPort();  // Siempre usa el puerto sin filtrar

        // Usamos la constante BASE_PATH para construir las rutas
        return "Bienvenido a la API de Estudiantes de CRUD Rápido.<br><br>"
                + "A continuación te explicamos cómo acceder a los endpoints:<br><br>"

                + "<strong>1. Obtener todos los estudiantes (GET):</strong><br>"
                + "   Ruta: " + BASE_PATH + "/obtenerEstudiantes<br>"
                + "   Descripción: Este endpoint te devuelve la lista de todos los estudiantes registrados.<br>"
                + "   En Postman:<br>"
                + "     Método: GET<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/obtenerEstudiantes\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/obtenerEstudiantes</a><br><br>"

                + "<strong>2. Guardar un nuevo estudiante (POST):</strong><br>"
                + "   Ruta: " + BASE_PATH + "/guardarEstudiante<br>"
                + "   Descripción: Usa este endpoint para guardar un nuevo estudiante.<br>"
                + "   En Postman:<br>"
                + "     Método: POST<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/guardarEstudiante\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/guardarEstudiante</a><br>"
                + "     En el cuerpo (Body) de la solicitud, usa JSON con los datos del estudiante:<br>"
                + "     {\"email\": \"maria.gomez@example.com\", \"firstName\": \"María\", \"lastName\": \"Gómez\"}<br><br>"


                + "<strong>3. Obtener un estudiante por ID (GET):</strong><br>"
                + "   Ruta: " + BASE_PATH + "/obtenerEstudiante/{id}<br>"
                + "   Descripción: Obtén los datos de un estudiante específico usando su ID.<br>"
                + "   En Postman:<br>"
                + "     Método: GET<br>"
                + "     URL: <a href=\"" + urlAplicacion + BASE_PATH + "/obtenerEstudiante/{id}\" target=\"_blank\">"
                + urlAplicacion + BASE_PATH + "/obtenerEstudiante/{id}</a><br>"
                + "     Reemplaza {id} con el ID del estudiante que deseas consultar.<br><br>"

                + "Servidor ejecutándose en <a href=\"" + urlAplicacion + "\" target=\"_blank\">" + urlAplicacion + "</a>.";
    }

    // POST: guardar un estudiante
    @PostMapping("/guardarEstudiante")
    public estudiante save(@RequestBody estudiante nuevoEstudiante) {
        studentService.saveEstudiante(nuevoEstudiante); // Guarda el estudiante
        return nuevoEstudiante;
    }

    // GET: obtener todos los estudiantes
    @GetMapping("/obtenerEstudiantes")
    public List<estudiante> getEstudiantes() {
        return studentService.getEstudianteTodos(); // Retorna todos los estudiantes
    }

    // GET: obtener un estudiante por su ID
    @GetMapping("/obtenerEstudiante/{id}")
    public estudiante getEstudianteById(@PathVariable Long id) {
        return studentService.getEstudiante(id).orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));
    }

    // DELETE: eliminar un estudiante por su ID
    @DeleteMapping("/{id}")
    public void deleteEstudiante(@PathVariable Long id) {
        studentService.deleteEstudiante(id); // Elimina el estudiante
    }
}


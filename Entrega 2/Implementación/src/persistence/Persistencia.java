
package persistence;

import model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Persistencia {
    private static final String DATA_FILE = "data.json";
    private Gson gson;

    public Persistencia() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public List<User> cargarUsuarios() {
        try (FileReader reader = new FileReader(DATA_FILE)) {
            Type userListType = new TypeToken<ArrayList<User>>(){}.getType();
            return gson.fromJson(reader, userListType);
        } catch (IOException e) {
            System.out.println("Error cargando usuarios: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void guardarUsuarios(List<User> usuarios) {
        try (FileWriter writer = new FileWriter(DATA_FILE)) {
            gson.toJson(usuarios, writer);
        } catch (IOException e) {
            System.out.println("Error guardando usuarios: " + e.getMessage());
        }
    }

    public List<LearningPath> cargarLearningPaths() {
        try (FileReader reader = new FileReader(DATA_FILE)) {
            Type learningPathListType = new TypeToken<ArrayList<LearningPath>>(){}.getType();
            return gson.fromJson(reader, learningPathListType);
        } catch (IOException e) {
            System.out.println("Error cargando Learning Paths: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void guardarLearningPaths(List<LearningPath> learningPaths) {
        try (FileWriter writer = new FileWriter(DATA_FILE)) {
            gson.toJson(learningPaths, writer);
        } catch (IOException e) {
            System.out.println("Error guardando Learning Paths: " + e.getMessage());
        }
    }

    public List<Inscripcion> cargarInscripciones() {
        try (FileReader reader = new FileReader(DATA_FILE)) {
            Type inscripcionListType = new TypeToken<ArrayList<Inscripcion>>(){}.getType();
            return gson.fromJson(reader, inscripcionListType);
        } catch (IOException e) {
            System.out.println("Error cargando Inscripciones: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void guardarInscripciones(List<Inscripcion> inscripciones) {
        try (FileWriter writer = new FileWriter(DATA_FILE)) {
            gson.toJson(inscripciones, writer);
        } catch (IOException e) {
            System.out.println("Error guardando Inscripciones: " + e.getMessage());
        }
    }
}

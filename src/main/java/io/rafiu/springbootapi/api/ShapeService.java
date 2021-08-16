package io.rafiu.springbootapi.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {

   @Autowired
   private ShapeRepository shapeRepository;
	
   public List<Shape> getAllShapes() {
	   List<Shape> shapes = new ArrayList<>();
	   shapeRepository.findAll()
	   .forEach(shapes::add);
	   
	   return shapes;
   }
   
   public void addShape(Shape shape) {
	   shapeRepository.save(shape);
   }
   
   public Optional<Shape> getResult( String id) {
	   return shapeRepository.findById(id);
   }
   
   public void updateShape(String id,Shape shape) {
	   shapeRepository.save(shape);
	}
}

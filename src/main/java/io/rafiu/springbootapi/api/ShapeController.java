package io.rafiu.springbootapi.api;

import java.util.List;
import java.util.Optional;
import org.json.simple.JSONObject;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {
	
	@Autowired
	private ShapeService shapeService;
	
	@RequestMapping("/shapes")
	public List<Shape> getAllShapes() {
		return shapeService.getAllShapes();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addShape")
	public void addShape(@RequestBody Shape []shape) {
		
		for (Shape s:shape) {
			if(s.getType() == "square" || s.getType() == "rectangle") {
				s.setResult(Integer.toString(Integer.parseInt(s.getLength())*Integer.parseInt(s.getBreadth())));
			}
			else {
				s.setResult(Double.toString(3.14*(Double.parseDouble(s.getLength())*Double.parseDouble(s.getBreadth()))));
			}
			
			shapeService.addShape(s);
		}
	}
	
	@RequestMapping("/results/{task_id}")
    public Optional<Shape> getResult(@PathVariable String task_id) {
	   Optional<Shape> shape = shapeService.getResult(task_id);
	   /* JSONObject obj=new JSONObject();
	    
	    obj.put(task_id,shape.result);*/
		
	    return shape;
    }
	
}

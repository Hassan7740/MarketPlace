package ITI.JETS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ITI.JETS.reposrtories.ProductRepository;
import ITI.JETS.services.AddProductService;
import ITI.JETS.services.DTOS.RequestDTOS.AddProductDTO;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository productRepo;

	@PostMapping
	public ResponseViewModel AddProduct(@RequestBody AddProductDTO addProductDTO){
		return null;
	}

	@DeleteMapping("/deleteProduct/{id}")
	public ResponseViewModel deleteProductById(@PathVariable Integer id){
		productRepo.deleteById(id);
		return null; 
	}

}

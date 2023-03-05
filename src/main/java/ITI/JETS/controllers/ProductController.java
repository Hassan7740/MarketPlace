package ITI.JETS.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ITI.JETS.reposrtories.ProductRepository;
import ITI.JETS.services.ProductService;
import ITI.JETS.services.dtos.requestdtos.AddProductDTO;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	ProductService pService = new ProductService();

	@GetMapping("{productName}")
	public ResponseViewModel searchProductByName(@PathVariable String productName)
	{
		return pService.search(productName);
	}

	@PostMapping
	public ResponseViewModel AddProduct(@RequestBody AddProductDTO productDTO)
	{
		return pService.add(productDTO);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public ResponseViewModel deleteProductById(@PathVariable Integer id){
		productRepo.deleteById(id);
		return null; 
	}

}

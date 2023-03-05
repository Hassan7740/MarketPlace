package ITI.JETS.reposrtories;

import org.springframework.data.jpa.repository.Query;

import ITI.JETS.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface ProductRepository extends JpaRepository<Product,Integer>{}

package services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionProduits<T, ID> extends JpaRepository<T, ID>  {

}

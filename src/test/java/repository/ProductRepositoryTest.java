package repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    Product book1 = new Book(3, "book1", 1000, "автор1");
    Product book2 = new Book(2, "book2", 2000, "автор2");
    Product smartphone1 = new Smartphone(11, "iPhone", 5000, "USA");
    Product smartphone2 = new Smartphone(22, "Honor", 2000, "China");

    @BeforeEach
    public void setUp() {
        repository.save(book1);
        repository.save(book2);
        repository.save(smartphone1);
        repository.save(smartphone2);
    }


    @Test
    public void shouldSaveAll() {
        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        repository.removeById(11);
        Product[] expected = {book1, book2, smartphone2};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        repository.findAll();
        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}
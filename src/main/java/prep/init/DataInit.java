package prep.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import prep.service.CategoryService;

@Component
public class DataInit implements CommandLineRunner {

    private final CategoryService categoryService;

    @Autowired
    public DataInit(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {

        this.categoryService.initCategories();
    }
}

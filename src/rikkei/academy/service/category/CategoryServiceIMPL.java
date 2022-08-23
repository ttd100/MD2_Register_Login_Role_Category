package rikkei.academy.service.category;

import rikkei.academy.config.Config;
import rikkei.academy.model.Category;
import rikkei.academy.model.User;
import rikkei.academy.service.user.IUserService;
import rikkei.academy.service.user.UserServiceIMPL;

import java.util.List;

public class CategoryServiceIMPL implements ICategoryService{
    private IUserService userService = new UserServiceIMPL();
    public static String PATH_CATEGORY = "D:\\register_login\\src\\rikkei\\academy\\database\\category.txt";
    public static List<Category> categoryList = new Config<Category>().readFile(PATH_CATEGORY);
    @Override
    public List findAll() {
        new Config<Category>().writeFile(PATH_CATEGORY, categoryList);
        return categoryList;
    }

    @Override
    public void save(Category category) {
        User user = userService.getCurrentUser();
        category.setUser(user);
        categoryList.add(category);

    }
}

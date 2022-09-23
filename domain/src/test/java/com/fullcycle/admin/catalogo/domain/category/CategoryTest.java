package com.fullcycle.admin.catalogo.domain.category;

import com.fullcycle.admin.catalogo.domain.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {
    @Test
    public void givenAvalidParam_whenCallNewCategory_thenInstantiateAcategory() {
        final var expectedName = "Filmes";
        final var expectedDescription = "A catergoria mais assistida";
        final var expectedIsActive = true;
        final var actualCategory = Category.newCategory();
    }
}

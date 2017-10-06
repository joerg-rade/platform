package org.incode.domainapp.example.dom.demo.dom.todo;

import java.util.Arrays;
import java.util.List;

public enum Category {
    Professional {
        @Override
        public List<Subcategory> subcategories() {
            return Arrays
                    .asList(null, Subcategory.OpenSource, Subcategory.Consulting, Subcategory.Education);
        }
    }, Domestic {
        @Override
        public List<Subcategory> subcategories() {
            return Arrays.asList(null, Subcategory.Shopping, Subcategory.Housework, Subcategory.Garden,
                    Subcategory.Chores);
        }
    }, Other {
        @Override
        public List<Subcategory> subcategories() {
            return Arrays.asList(null, Subcategory.Other);
        }
    };

    public abstract List<Subcategory> subcategories();
}

package com.example.restaurant.wishlist.repository;

import com.example.restaurant.wishlist.entity.WishListEntity;
import com.example.restaurant.wishlist.entity.repository.WishListRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class WishListRepositoryTest {

    @Autowired
    private WishListRepository wishListRepository;

    private WishListEntity create() {
        var wishList = new WishListEntity();
        wishList.setTitle("title");
        wishList.setCategory("category");
        wishList.setAddress("address");
        wishList.setReadAddress("readAddress");
        wishList.setHomePageLink("");
        wishList.setImageLink("");
        wishList.setVisit(false);
        wishList.setVisitCount(0);
        wishList.setLastVisitDate(null);

        return wishList;

    }

    @Test
    public void saveTest() {
        var wishListEntity =create();
        wishListRepository.save(wishListEntity);
        var expected = wishListRepository.findById(1);

        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1,expected.get().getIndex());

    }
    @Test
    public void findByIdTest() {
        var wishListEntity = create();
        wishListRepository.save(wishListEntity);
        var expected = wishListRepository.findById(1);

        Assertions.assertEquals(true, expected.isPresent());
        Assertions.assertEquals(1,expected.get().getIndex());

    }
    @Test
    public void deleteTest() {
        var wishListEntity = create();
        wishListRepository.save(wishListEntity);
        wishListRepository.deleteById(1);
        int count = wishListRepository.listAll().size();

        Assertions.assertEquals(0, count);


    }
    @Test
    public void listAllTest() {

    }
}

package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("product1");
        Invoice invoice = new Invoice("123/2019");
        Item item = new Item(product, new BigDecimal("100"), 1, invoice);

        product.getItems().add(item);
        invoice.getItems().add(item);

        //When
        productDao.save(product);
        invoiceDao.save(invoice);
        itemDao.save(item);

        //Then
        Assert.assertNotEquals(0, item.getId());

    }
}

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@Transactional          // jak clean tylko nie trzeba dodawać kodu / wazne w ten sposob dziala tylko w testach w kodzie inaczej
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;


    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("list1", "description1");
        taskListDao.save(taskList);

        //When
        List<TaskList> result = taskListDao.findByListName("list1");

        //Then
        Assert.assertEquals(1, result.size());


    }


}

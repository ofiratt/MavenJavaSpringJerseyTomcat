//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.mockito.Spy;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//@RunWith(MockitoJUnitRunner.class)
//public class CategoriesControllerTest extends ControllerExecutorTest {
//
//    @Spy protected Categories categories;
//    @InjectMocks CategoriesController categoriesController;
//    boolean hasException;
//
//    @Before
//    public void setUpTest() {
//        super.setUpTest();
//        categoriesController.setLastCategory("1");
//        hasException = false;
//    }
//
//    @Test
//    public void comment() throws SQLException{
//        Mockito.when(sqlExecutor.getCategories("1",storyError)).thenReturn(new ArrayList<Category>());
//        execute(categoriesController);
//    }
//
//    @Test
//    public void commentWithException() throws SQLException{
//        categoriesController.setLastCategory("-1");
//
//        try {
//            execute(categoriesController);
//        }catch(ServerException ex){
//            assertEquals(ex.getServerStatus(), ServerStatus.InvalidInput);
//            hasException = true;
//        }
//        assertTrue(hasException);
//    }
//
//}

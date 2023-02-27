
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;
class WallTest {

    @Test
    void shouldCountAmountElementInBlockList(){
        //given
        Wall wall =  new Wall();
        //when
        //then
        assertEquals(10,wall.count());
    }
    @Test
    void shouldCountAmountElementInBlockListAndReturnNegativeAnswer(){
        //given
        Wall wall = new Wall();
        //when
        //then
        assertNotEquals(11,wall.count());
    }
    @Test //Test metody findBlockByColor
    void shouldFindAnyWhiteElementInBlockList(){
        //given
        Wall wall = new Wall();
        wall.findBlockByColor("white");
        //when
        Optional<Block> block = Optional.of(wall.block);
        //then
        assertTrue(block.isPresent());
    }
    @Test   //Test metody findBlockByColor
    void shouldThrowNoSuchElementExceptionIfBlockNotExist(){
        //given
        Wall wall = new Wall();
        wall.findBlockByColor("pink");
        //when
        Optional<Block> block = Optional.of(wall.block);
        //then
        assertNotEquals(NoSuchElementException.class,block.get());

    }

    @Test
    void shouldReturnEmptyListIfBlockByMaterialNotExist(){
        //given
        Wall wall = new Wall();
        List<Block> blockList = Arrays.asList(new NormalBlock("white","brick")
                ,new NormalBlock("orange","airbrick")
                ,new NormalBlock("brown","brick"));
        //when
        //then
        assertThat(wall.findBlockByMaterial("wood"), IsEmptyCollection.empty());
    }
    @Test
    void shouldReturnListBlockByMaterial(){
        //given
        Wall wall = new Wall();
        List<Block> blockList = Arrays.asList(new NormalBlock("brown","brick")
                ,new NormalBlock("white","brick")
                ,new NormalBlock("red","brick")
                ,new NormalBlock("orange","brick")
                ,new NormalBlock("orange","airbrick"));
        //when
        List<Block> expectedBlockList = wall.findBlockByMaterial("brick");
        //then
        assertThat(expectedBlockList,containsInAnyOrder(blockList));
    }
}
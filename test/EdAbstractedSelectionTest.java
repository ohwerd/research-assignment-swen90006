import java.util.List;
import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class EdAbstractedSelectionTest
{

  //Any method annotated with "@Before" will be executed before each test,
  //allowing the tester to set up some shared resources.
  @Before
  public void setUp()
  {
  }

  //Any method annotated with "@After" will be executed afteqr each test,
  //allowing the tester to release any shared resources used in the setup.
  @After
  public void tearDown()
  {
  }

  //Any method annotation with "@Test" is executed as a test.
  @Test
  public void zeroElementdoSelectionSortTest()
  {
    int[] zeroArray = {};
    //the assertTrue method is used to check whether something holds
    int[] checkArray = {};
    MySelectionSort.doSelectionSort(zeroArray);
    assertArrayEquals(zeroArray, checkArray);
  }

  @Test
  public void oneElementdoSelectionSortTest()
  {
    int[] oneArray = {8};
    //the assertTrue method is used to check whether something holds
    int[] checkArray = {8};
    MySelectionSort.doSelectionSort(oneArray);
    assertArrayEquals(oneArray, checkArray);
  }

  @Test
  public void manyElementdoSelectionTest()
  {
    int[] manyArray = {10,8,4,6,5,1,3,7,2,9};
    MySelectionSort.doSelectionSort(manyArray);
    int[] checkArray = {1,2,3,4,5,6,7,8,9,10};
    assertArrayEquals(manyArray, checkArray);
  }

  @Test
  public void firstElementdoSelectionTest()
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    MySelectionSort.doSelectionSort(firstArray);
    assertArrayEquals(firstArray, firstArray);
  }

  @Test
  public void lastElementdoSelectionTest()
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    int[] lastArray = {6,5,5,5,5,5,5,5,5,5};
    MySelectionSort.doSelectionSort(lastArray);
    assertArrayEquals(firstArray, lastArray);
  }

  @Test
  public void mixedElementdoSelectionTest()
  {
    int[] mixedArray = {5,6,5,6,5,6,5,6,5,6};
    MySelectionSort.doSelectionSort(mixedArray);
    int[] checkArray = {5,5,5,5,5,6,6,6,6,6};
    assertArrayEquals(mixedArray, checkArray);
  }

  @Test (expected = java.io.IOException.class)
  public void zeroElementfindSmallestElementTest() throws Throwable
  {
    int[] zeroArray = {};
    assert(MySelectionSort.findSmallestElement(zeroArray, 1, 1) == 0);
  }

  @Test
  public void oneElementfindSmallestElementTest()
  {
    int[] oneArray = {8};
    //the assertTrue method i;s used to check whether something holds
    assert(MySelectionSort.findSmallestElement(oneArray, 1, 1)==8);
  }

  @Test
  public void manyElementfindSmallestElementTest()
  {
    int[] manyArray = {10,8,4,6,5,1,3,7,2,9};
    assert(MySelectionSort.findSmallestElement(manyArray, 1, 1)==0);
  }

  @Test
  public void firstElementfindSmallestElementTest()
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    assert(MySelectionSort.findSmallestElement(firstArray, 1, 1)==8 || MySelectionSort.findSmallestElement(firstArray, 1, 1)==0);
  }

  @Test
  public void lastElementfindSmallestElementTest()
  {
    int[] lastArray = {6,5,5,5,5,5,5,5,5,5};
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    assert(MySelectionSort.findSmallestElement(lastArray, 1, 1)==1 || MySelectionSort.findSmallestElement(firstArray, 1, 1)==9);
  }

  @Test
  public void mixedElementfindSmallestElementTest()
  {
    int[] mixedArray = {5,6,5,6,5,6,5,6,5,6};
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    assert(MySelectionSort.findSmallestElement(mixedArray, 1, 1)==0 || MySelectionSort.findSmallestElement(firstArray, 1, 1)==8);
  }

  @Test (expected = java.io.IOException.class)
  public void zeroElementisSmallerElementSwapTest() throws Throwable
  {
    int[] zeroArray = {};
    assert(MySelectionSort.isSmallerElementSwapIndex(zeroArray, 1, 1) == 0);
  }

  @Test (expected = java.io.IOException.class)
  public void oneElementisSmallerElementSwapTest() throws Throwable
  {
    int[] oneArray = {8};
    //the assertTrue method i;s used to check whether something holds
    assert(MySelectionSort.isSmallerElementSwapIndex(oneArray, 0, 0)==0);
  }

  @Test
  public void manyElementisSmallerElementSwapTest()
  {
    int[] manyArray = {10,8,4,6,5,1,3,7,2,9};
    assert(MySelectionSort.isSmallerElementSwapIndex(manyArray, 1, 2)==1);
  }

  @Test
  public void firstArrayElementisSmallerElementSwapTest()
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    assert(MySelectionSort.isSmallerElementSwapIndex(firstArray, 0, 1)==0);
  }

  @Test
  public void lastArrayElementisSmallerElementSwapTest()
  {
    int[] lastArray = {6,5,5,5,5,5,5,5,5,5};
    assert(MySelectionSort.isSmallerElementSwapIndex(lastArray, 8, 9)==8);
  }

  @Test
  public void mixedArrayElementisSmallerElementSwapTest()
  {
    int[] mixedArray = {5,6,5,6,5,6,5,6,5,6};
    assert(MySelectionSort.isSmallerElementSwapIndex(mixedArray, 1, 2)==2);
  }

  @Test (expected = java.io.IOException.class)
  public void zeroElementSwapTest() throws Throwable
  {
    int[] zeroArray = {};
    assert(MySelectionSort.swapElements(zeroArray, 0, 0) == zeroArray);
  }

  @Test
  public void oneElementSwapTest()
  {
    int[] oneArray = {8};
    //the assertTrue method i;s used to check whether something holds
    assertArrayEquals(MySelectionSort.swapElements(oneArray, 0, 0), oneArray);
  }

  @Test
  public void manyElementSwapTest()
  {
    int[] manyArray = {10,8,4,6,5,1,3,7,2,9};
    int[] checkArray = {10,4,8,6,5,1,3,7,2,9};
    assertArrayEquals(MySelectionSort.swapElements(manyArray, 1, 2), checkArray);
  }

  @Test
  public void firstArrayElementSwapTest()
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    int[] checkArray = {5,6,5,5,5,5,5,5,5,5};
    assertArrayEquals(MySelectionSort.swapElements(firstArray, 0, 1), checkArray);
  }

  @Test
  public void lastArrayElementSwapTest()
  {
    int[] lastArray = {6,5,5,5,5,5,5,5,5,5};
    int[] checkArray = {5,5,5,5,5,5,5,5,6,5};
    assertArrayEquals(MySelectionSort.swapElements(lastArray, 8, 9), checkArray);
  }

  @Test
  public void mixedArrayElementSwapTest()
  {
    int[] mixedArray = {5,6,5,6,5,6,5,6,5,6};
    int[] checkArray = {5,6,5,6,5,6,5,6,6,5};
    assertArrayEquals(MySelectionSort.swapElements(mixedArray, 8, 9), checkArray);
  }

}

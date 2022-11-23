import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tester les opérations arithmétiques de bases")
class MathUtilsTest {

    // @BeforeAll : Configurations avant tous les tests (Créer ou se connecter à une base de données)
    // @BeforeEach : Configurations avant chaque test (Créer par exemple l'instance de la classe MathUtil)
    // @AfterEach : Configurations après chaque test (nettoyage...)
    // @afterAll : Configurations après tous les tests (Supprimer la base de données)

    private MathUtils mathUtils;
//    @BeforeAll
//    static void setup() {
//        System.out.println("Excution de @BeForeAll");
//    }

    @BeforeEach
    void beForeEach() {
        System.out.println("Excution de @BeForeEach");
        mathUtils=new MathUtils();
    }

    @AfterEach
    void afterEach() {
        System.out.println("Excution de @AfterEach");
        mathUtils=null;
    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("Exécution de @AfterAll");
//    }

    @DisplayName("Tester la somme de 2 nombres")
    @Test
    void testAdd() {
//        var mathUtils=new MathUtils(); // Création instance/objet mathUtils
//        var resultat=mathUtils.add(5,6);
        assertEquals(11,mathUtils.add(5,6));
        assertEquals(12, mathUtils.add(8,4));
    }

    @DisplayName("Tester la soustraction de deux valeurs")
    @Test
    void testSubstraction() {
        var nb1=10;
        var nb2=6;
        var expectedResult=4;
//        var mathUtils=new MathUtils();
        assertEquals(4, mathUtils.substract(nb1,nb2), String.format("%d - %d doit être" + "égal à %d",
                nb1, nb2, expectedResult));

    }
}
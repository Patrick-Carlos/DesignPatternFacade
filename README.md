# 🍔 Design Pattern Facade - Fast Food

O padrão **Facade** fornece uma interface simplificada para um conjunto mais complexo de classes (subsistemas). Neste projeto, encapsulamos a lógica de montagem de combos de fast food, estoque, cozinha e pagamento por meio de uma única fachada.

---

## 📦 Estrutura geral do projeto

```
src/
 └── main/
     └── java/
         ├── com/facade/Main.java
         ├── facade/ComboFacade.java
         └── model/
             ├── ItemCombo.java
             ├── Bugers.java
             ├── Bebidas.java
             ├── Sobremesas.java
             └── Combos.java
```

---

## 🔍 Explicação das classes

### 📦 model/ItemCombo.java
```java
package model;

public interface ItemCombo {
    String getNome();
    double getPreco();
}
```
- Define o contrato para qualquer item de combo (burger, bebida, sobremesa).

---

### 🍔 model/Bugers.java
```java
package model;

public class Bugers implements ItemCombo {
    // nome e preço do burger
    public static Bugers comboMaster() {...}
    public static Bugers superBurger() {...}
    public static Bugers veggie() {...}
    public static Bugers mini() {...}
}
```
- Fabrica hambúrgueres pré-configurados.

---

### 🥤 model/Bebidas.java
```java
package model;

public class Bebidas implements ItemCombo {
    // métodos de fábrica: cola(), sucoLaranja(), sucoVerde(), agua()
}
```
- Fabrica bebidas pré-configuradas.

---

### 🍨 model/Sobremesas.java
```java
package model;

public class Sobremesas implements ItemCombo {
    // métodos de fábrica: sorvete(), brownie(), frutaEstacao(), cookie()
}
```
- Fabrica sobremesas pré-configuradas.

---

### 🍽️ model/Combos.java
```java
package model;

public class Combos {
    // Agrega um ItemCombo de cada tipo
}
```
- Representa um combo completo (burger + bebida + sobremesa).

---

### 🛠️ facade/ComboFacade.java
```java
package facade;

public class ComboFacade {
    private Combos combo;

    public void criarCombo(int codigo) { ... }
    public void exibirItens() { ... }
    public double getPrecoTotal() { ... }
}
```
- **Fachada**: centraliza a criação, exibição e cálculo de preço total de combos.
- Simplifica o uso dos subsistemas de model.

---

### 🖥️ com/facade/Main.java
```java
package com.facade;

public class Main {
    public static void main(String[] args) {
        // loop de menu: escolhe combos, confirma, finaliza e mostra resumo
    }
}
```
- Cliente que interage apenas com `ComboFacade`, sem conhecer detalhes internos.

---

## 📌 Como o Facade foi aplicado

| Elemento      | Papel no Facade                             |
|---------------|----------------------------------------------|
| `Bugers`      | Subsistema (itens individuais)               |
| `Bebidas`     | Subsistema (itens individuais)               |
| `Sobremesas`  | Subsistema (itens individuais)               |
| `Combos`      | Subsistema (agrega itens em um combo)        |
| `ComboFacade` | Fachada (interface simplificada para cliente)|
| `Main`        | Cliente (usa a fachada para operações)       |

---

**Benefícios**:
- Oculta a complexidade de múltiplas classes.
- Reduz acoplamento entre cliente e subsistemas.
- Facilita manutenção e extensão de novos tipos de combos.


# Reference
## Customers
<details><summary><code>client.customers.list() -> List&lt;Customer&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.create(request) -> Customer</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().create(
    CustomerCreate
        .builder()
        .name("Acme, Inc.")
        .externalId("acme-inc")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**phone:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**employeeCount:** `Optional<Float>` 
    
</dd>
</dl>

<dl>
<dd>

**annualRevenue:** `Optional<Float>` 
    
</dd>
</dl>

<dl>
<dd>

**taxExemptStatus:** `Optional<TaxExemptStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**creationSource:** `Optional<CreationSource>` 
    
</dd>
</dl>

<dl>
<dd>

**website:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingAddress:** `Optional<Address>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.get(customerId) -> Customer</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().get("customerId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**customerId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.update(customerId, request) -> Customer</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().update(
    "customerId",
    CustomerUpdate
        .builder()
        .name("Acme, Inc. (Updated)")
        .phone("123-456-7890")
        .employeeCount(101)
        .annualRevenue(1000001)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**customerId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUpdate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.delete(customerId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().delete("customerId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**customerId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getByExternalId(externalId) -> Customer</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getByExternalId("externalId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.updateByExternalId(externalId, request) -> Customer</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().updateByExternalId(
    "externalId",
    CustomerUpdate
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUpdate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteByExternalId(externalId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().deleteByExternalId("externalId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Agents
<details><summary><code>client.agents.list() -> List&lt;Agent&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agents.create(request) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().create(
    AgentCreate
        .builder()
        .name("Acme Agent")
        .description("Acme Agent is an AI agent that does things.")
        .externalId("acme-agent")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**description:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**agentCode:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**active:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agents.get(agentId) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().get("agentId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agents.update(agentId, request) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().update(
    "agentId",
    AgentUpdate
        .builder()
        .name("Acme Agent (Updated)")
        .agentAttributes(
            new ArrayList<AgentAttribute>(
                Arrays.asList(
                    AgentAttribute
                        .builder()
                        .name("Emails sent signal")
                        .active(true)
                        .pricing(
                            Pricing
                                .builder()
                                .taxable(true)
                                .chargeType(ChargeType.USAGE)
                                .pricingModel(PricingModelType.PER_UNIT)
                                .billingFrequency(BillingFrequency.MONTHLY)
                                .pricePoints(
                                    new HashMap<String, AgentPricePoint>() {{
                                        put("USD", AgentPricePoint
                                            .builder()
                                            .tiers(
                                                Optional.of(
                                                    new ArrayList<AgentPricePointTiers>(
                                                        Arrays.asList(
                                                            AgentPricePointTiers
                                                                .builder()
                                                                .unitPrice(100)
                                                                .minQuantity(0)
                                                                .maxQuantity(10)
                                                                .build(),
                                                            AgentPricePointTiers
                                                                .builder()
                                                                .unitPrice(90)
                                                                .minQuantity(11)
                                                                .maxQuantity(100)
                                                                .build(),
                                                            AgentPricePointTiers
                                                                .builder()
                                                                .unitPrice(80)
                                                                .minQuantity(101)
                                                                .build()
                                                        )
                                                    )
                                                )
                                            )
                                            .build());
                                    }}
                                )
                                .eventName("emails_sent")
                                .build()
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `AgentUpdate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agents.delete(agentId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().delete("agentId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agents.getByExternalId(externalId) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().getByExternalId("externalId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agents.updateByExternalId(externalId, request) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().updateByExternalId(
    "externalId",
    AgentUpdate
        .builder()
        .name("Acme Agent (Updated)")
        .agentAttributes(
            new ArrayList<AgentAttribute>(
                Arrays.asList(
                    AgentAttribute
                        .builder()
                        .name("Emails sent signal")
                        .active(true)
                        .pricing(
                            Pricing
                                .builder()
                                .taxable(true)
                                .chargeType(ChargeType.USAGE)
                                .pricingModel(PricingModelType.PER_UNIT)
                                .billingFrequency(BillingFrequency.MONTHLY)
                                .pricePoints(
                                    new HashMap<String, AgentPricePoint>() {{
                                        put("USD", AgentPricePoint
                                            .builder()
                                            .unitPrice(Optional.of(150))
                                            .build());
                                    }}
                                )
                                .eventName("emails_sent")
                                .build()
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `AgentUpdate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agents.deleteByExternalId(externalId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agents().deleteByExternalId("externalId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Contacts
<details><summary><code>client.contacts.list() -> List&lt;Contact&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.create(request) -> Contact</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().create(
    ContactCreate
        .builder()
        .salutation(Salutation.MR)
        .firstName("John")
        .lastName("Doe")
        .email("john.doe@example.com")
        .customerExternalId("acme-inc")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**customerExternalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**salutation:** `Salutation` 
    
</dd>
</dl>

<dl>
<dd>

**firstName:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**lastName:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**email:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**phone:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingStreet:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingCity:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingStateProvince:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingCountry:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingPostalCode:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.get(contactId) -> Contact</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().get("contactId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contactId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.delete(contactId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().delete("contactId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contactId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.getByExternalId(externalId) -> Contact</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().getByExternalId("externalId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.deleteByExternalId(externalId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().deleteByExternalId("externalId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**externalId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Orders
<details><summary><code>client.orders.list() -> List&lt;Order&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.create(request) -> Order</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().create(
    OrderCreate
        .builder()
        .name("Acme Order")
        .startDate("2025-01-01")
        .currency("USD")
        .customerExternalId("acme-inc")
        .description("Acme Order is an order for Acme, Inc.")
        .endDate("2026-01-01")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**customerId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**customerExternalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingContactId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**currency:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**orderLines:** `Optional<List<OrderLineCreate>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.get(orderId) -> Order</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().get("orderId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.delete(orderId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().delete("orderId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.activate(orderId) -> Order</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().activate("orderId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Usage
<details><summary><code>client.usage.recordBulk(request) -> List&lt;Object&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.usage().recordBulk(
    UsageRecordBulkRequest
        .builder()
        .signals(
            new ArrayList<Signal>(
                Arrays.asList(
                    Signal
                        .builder()
                        .build(),
                    Signal
                        .builder()
                        .build(),
                    Signal
                        .builder()
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**signals:** `Optional<List<Signal>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Orders Lines
<details><summary><code>client.orders.lines.update(orderId, request) -> Order</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().lines().update(
    "orderId",
    LinesUpdateRequest
        .builder()
        .lines(
            new ArrayList<OrderLineCreate>(
                Arrays.asList(
                    OrderLineCreate
                        .builder()
                        .agentExternalId("acme-agent")
                        .name("Order Line One")
                        .description("Order Line One is an order line for Acme, Inc.")
                        .build(),
                    OrderLineCreate
                        .builder()
                        .agentExternalId("acme-agent-2")
                        .name("Order Line Two")
                        .description("Order Line Two is an order line for Acme, Inc.")
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**lines:** `Optional<List<OrderLineCreate>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

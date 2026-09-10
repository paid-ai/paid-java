# Reference
## Products
<details><summary><code>client.products.listProducts() -> ProductListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a list of products for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.products().listProducts(
    ListProductsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Search by product name (case-insensitive, matches anywhere in the name).
    
</dd>
</dl>

<dl>
<dd>

**active:** `Optional<Boolean>` — Filter by the product's active flag: true or false.
    
</dd>
</dl>

<dl>
<dd>

**archived:** `Optional<Boolean>` — Filter by archived state: true returns only archived products, false only non-archived. Omit to include both.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.products.createProduct(request) -> Product</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new product for the organization. Products are created without pricing: to create product attributes and set their pricing, call the update product endpoint (updateProductById / updateProductByExternalId), which upserts productAttributes.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.products().createProduct(
    CreateProductRequest
        .builder()
        .name("name")
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

**description:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**active:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**productCode:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.products.getProductById(id) -> ProductDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a product by ID, including its product attributes with pricing details
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.products().getProductById(
    "id",
    GetProductByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.products.updateProductById(id, request) -> ProductDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a product by ID. Also creates and edits product attributes: productAttributes upserts attributes and sets their pricing (metering event, price points, credit brackets). This is the endpoint to use to add pricing to a product created without any.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.products().updateProductById(
    "id",
    UpdateProductByIdRequest
        .builder()
        .body(
            UpdateProductRequest
                .builder()
                .build()
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `UpdateProductRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.products.getProductByExternalId(externalId) -> ProductDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a product by external ID, including its product attributes with pricing details
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.products().getProductByExternalId(
    "externalId",
    GetProductByExternalIdRequest
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
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.products.updateProductByExternalId(externalId, request) -> ProductDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a product by external ID. Also creates and edits product attributes: productAttributes upserts attributes and sets their pricing (metering event, price points, credit brackets). This is the endpoint to use to add pricing to a product created without any.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.products().updateProductByExternalId(
    "externalId",
    UpdateProductByExternalIdRequest
        .builder()
        .body(
            UpdateProductRequest
                .builder()
                .build()
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

**request:** `UpdateProductRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Plans
<details><summary><code>client.plans.listPlans() -> PlanListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns plans for your organization, including archived plans by default, optionally filtered to a product.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.plans().listPlans(
    ListPlansRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**productId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalProductId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**includeArchived:** `Optional<Boolean>` — Whether to include archived plans in the response. Defaults to true.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.plans.createPlan(request) -> Plan</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new plan for a product.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.plans().createPlan(
    CreatePlanRequest
        .builder()
        .productId("productId")
        .attributes(
            new ArrayList<PlanAttributeInput>(
                Arrays.asList(
                    PlanAttributeInput
                        .builder()
                        .productAttributeId("productAttributeId")
                        .pricing(
                            ProductPricingInput.recurringPerUnit(
                                ProductRecurringPerUnitInput
                                    .builder()
                                    .billingFrequency(ProductRecurringPerUnitInputBillingFrequency.MONTHLY)
                                    .pricePoints(
                                        new ArrayList<ProductSimplePricePoint>(
                                            Arrays.asList(
                                                ProductSimplePricePoint
                                                    .builder()
                                                    .currency("USD")
                                                    .unitPrice(99)
                                                    .build()
                                            )
                                        )
                                    )
                                    .build()
                            )
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

**productId:** `String` — Paid product ID, for example `prod_abc123`
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` — Your stable identifier for this plan
    
</dd>
</dl>

<dl>
<dd>

**supportedCurrencies:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**isDefault:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**attributes:** `List<PlanAttributeInput>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.plans.updatePlanUpgradePath(request) -> PlanUpgradePathResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates upgrade path ordering for plans within a product, grouped by billing frequency.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.plans().updatePlanUpgradePath(
    UpdatePlanUpgradePathRequest
        .builder()
        .productId("productId")
        .groups(
            new ArrayList<PlanUpgradePathGroup>(
                Arrays.asList(
                    PlanUpgradePathGroup
                        .builder()
                        .planIds(
                            new ArrayList<String>(
                                Arrays.asList("planIds")
                            )
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

**productId:** `String` — Paid product ID, for example `prod_abc123`
    
</dd>
</dl>

<dl>
<dd>

**groups:** `List<PlanUpgradePathGroup>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.plans.getPlanById(id) -> Plan</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a plan by Paid plan ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.plans().getPlanById(
    "id",
    GetPlanByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.plans.updatePlanById(id, request) -> Plan</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a plan by Paid plan ID. If attributes are provided, they replace the plan's existing attributes. Set status to archive or restore the plan.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.plans().updatePlanById(
    "id",
    UpdatePlanByIdRequest
        .builder()
        .body(
            UpdatePlanRequest
                .builder()
                .build()
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `UpdatePlanRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.plans.getPlanByExternalId(externalId) -> Plan</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a plan by your external plan ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.plans().getPlanByExternalId(
    "externalId",
    GetPlanByExternalIdRequest
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
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.plans.updatePlanByExternalId(externalId, request) -> Plan</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a plan by your external plan ID. If attributes are provided, they replace the plan's existing attributes. Set status to archive or restore the plan.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.plans().updatePlanByExternalId(
    "externalId",
    UpdatePlanByExternalIdRequest
        .builder()
        .body(
            UpdatePlanRequest
                .builder()
                .build()
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

**request:** `UpdatePlanRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Customers
<details><summary><code>client.customers.listCustomers() -> CustomerListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a list of customers for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().listCustomers(
    ListCustomersRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Search by customer name (case-insensitive, matches anywhere in the name).
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<ListCustomersRequestStatus>` — Filter by customer status. churned: customers marked as churned. active: everyone else.
    
</dd>
</dl>

<dl>
<dd>

**creationState:** `Optional<ListCustomersRequestCreationState>` — Filter by creation state: draft or active.
    
</dd>
</dl>

<dl>
<dd>

**createdAtFrom:** `Optional<String>` — Only customers created on or after this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**createdAtTo:** `Optional<String>` — Only customers created on or before this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` — Filter by your external customer ID (exact match).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomer(request) -> Customer</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new customer for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().createCustomer(
    CreateCustomerRequest
        .builder()
        .name("name")
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

**legalName:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**email:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**phone:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**website:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingAddress:** `Optional<CustomerBillingAddressInput>` 
    
</dd>
</dl>

<dl>
<dd>

**creationState:** `Optional<CustomerCreationState>` 
    
</dd>
</dl>

<dl>
<dd>

**vatNumber:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**defaultCurrency:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerAliases(id) -> CustomerAliasListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List alternate external identifiers that resolve to a customer by Paid display ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().listCustomerAliases(
    "cus_abc123",
    ListCustomerAliasesRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomerAlias(id, request) -> CustomerAlias</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create an alternate external identifier for a customer by Paid display ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().createCustomerAlias(
    "cus_abc123",
    CreateCustomerAliasRequest
        .builder()
        .body(
            CustomerAliasCreateRequest
                .builder()
                .alias("child-customer-1")
                .build()
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerAliasCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteCustomerAlias(id, alias) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Remove an alternate external identifier from a customer by Paid display ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().deleteCustomerAlias(
    "cus_abc123",
    "child-customer-1",
    DeleteCustomerAliasRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**alias:** `String` — Customer alias value.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerById(id) -> Customer</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a customer by Paid display ID. Use the value returned as `customer.id`, for example `cus_abc123`. If you have your own customer ID, use `GET /api/v2/customers/external/{externalId}`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerById(
    "cus_abc123",
    GetCustomerByIdRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.updateCustomerById(id, request) -> Customer</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a customer by Paid display ID. Use the value returned as `customer.id`, for example `cus_abc123`. If you have your own customer ID, use `PUT /api/v2/customers/external/{externalId}`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().updateCustomerById(
    "cus_abc123",
    UpdateCustomerByIdRequest
        .builder()
        .body(
            UpdateCustomerRequest
                .builder()
                .build()
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**request:** `UpdateCustomerRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteCustomerById(id) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a customer by Paid display ID. Use the value returned as `customer.id`, for example `cus_abc123`. If you have your own customer ID, use `DELETE /api/v2/customers/external/{externalId}`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().deleteCustomerById(
    "cus_abc123",
    DeleteCustomerByIdRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerStateById(id) -> CustomerState</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the current customer state by Paid display ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerStateById(
    "cus_abc123",
    GetCustomerStateByIdRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerAliasesByExternalId(externalId) -> CustomerAliasListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List alternate external identifiers that resolve to a customer by external ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().listCustomerAliasesByExternalId(
    "customer_123",
    ListCustomerAliasesByExternalIdRequest
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomerAliasByExternalId(externalId, request) -> CustomerAlias</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create an alternate external identifier for a customer by external ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().createCustomerAliasByExternalId(
    "customer_123",
    CreateCustomerAliasByExternalIdRequest
        .builder()
        .body(
            CustomerAliasCreateRequest
                .builder()
                .alias("child-customer-1")
                .build()
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerAliasCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteCustomerAliasByExternalId(externalId, alias) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Remove an alternate external identifier from a customer by external ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().deleteCustomerAliasByExternalId(
    "customer_123",
    "child-customer-1",
    DeleteCustomerAliasByExternalIdRequest
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**alias:** `String` — Customer alias value.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerByExternalId(externalId) -> Customer</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a customer by external ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerByExternalId(
    "customer_123",
    GetCustomerByExternalIdRequest
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.updateCustomerByExternalId(externalId, request) -> Customer</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a customer by external ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().updateCustomerByExternalId(
    "customer_123",
    UpdateCustomerByExternalIdRequest
        .builder()
        .body(
            UpdateCustomerRequest
                .builder()
                .build()
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**request:** `UpdateCustomerRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteCustomerByExternalId(externalId) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a customer by external ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().deleteCustomerByExternalId(
    "customer_123",
    DeleteCustomerByExternalIdRequest
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerStateByExternalId(externalId) -> CustomerState</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Primary integration endpoint for agents and programmatic clients using their own customer IDs. Use the value you stored on `customer.externalId`, for example `customer_123`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerStateByExternalId(
    "customer_123",
    GetCustomerStateByExternalIdRequest
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerCreditBalances(id) -> CreditBalanceListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get current customer credit balances grouped by currency for a Paid customer display ID. Use the value returned as `customer.id`, for example `cus_abc123`. If you have your own customer ID, use `/api/v2/customers/external/{externalId}/credits/balances`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerCreditBalances(
    "cus_abc123",
    GetCustomerCreditBalancesRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.grantCustomerCredits(id, request) -> GrantCustomerCreditsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Immediately grant credits to a customer using an active credit currency key.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().grantCustomerCredits(
    "cus_abc123",
    GrantCustomerCreditsRequest
        .builder()
        .body(
            CreditGrantCreateRequest
                .builder()
                .creditCurrencyKey("api_credits")
                .amount(10000)
                .startsAt(OffsetDateTime.parse("2026-06-05T12:00:00Z"))
                .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .build()
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**request:** `CreditGrantCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerCreditBalancesByExternalId(externalId) -> CreditBalanceListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get current customer credit balances grouped by currency, looked up by external ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerCreditBalancesByExternalId(
    "customer_123",
    GetCustomerCreditBalancesByExternalIdRequest
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerPendingCreditConsumption(id) -> PendingCreditConsumptionListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List credit consumption that was recorded before a matching credit pool existed — for example usage that arrived before an invoice was paid or before a new period's credits were granted. Entries leave this list once they are applied to a pool or settled. Use the value returned as `customer.id`, for example `cus_abc123`. If you have your own customer ID, use `/api/v2/customers/external/{externalId}/credits/pending-consumption`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().listCustomerPendingCreditConsumption(
    "cus_abc123",
    ListCustomerPendingCreditConsumptionRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerPendingCreditConsumptionByExternalId(externalId) -> PendingCreditConsumptionListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List credit consumption recorded before a matching credit pool existed, for a customer looked up by external ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().listCustomerPendingCreditConsumptionByExternalId(
    "customer_123",
    ListCustomerPendingCreditConsumptionByExternalIdRequest
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.grantCustomerCreditsByExternalId(externalId, request) -> GrantCustomerCreditsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Immediately grant credits to a customer looked up by external ID using an active credit currency key.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().grantCustomerCreditsByExternalId(
    "customer_123",
    GrantCustomerCreditsByExternalIdRequest
        .builder()
        .body(
            CreditGrantCreateRequest
                .builder()
                .creditCurrencyKey("api_credits")
                .amount(10000)
                .startsAt(OffsetDateTime.parse("2026-06-05T12:00:00Z"))
                .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .build()
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

**externalId:** `String` — Customer ID from the integrator's system, stored on Paid as `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**request:** `CreditGrantCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.upsertCustomerUserByExternalId(customerExternalId, userExternalId, request) -> CustomerUser</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create or update a customer user using customer and user external IDs
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().upsertCustomerUserByExternalId(
    "customerExternalId",
    "userExternalId",
    UpsertCustomerUserRequest
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

**customerExternalId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**userExternalId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**email:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<CustomerUserStatus>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerUnitsByExternalId(externalId) -> CustomerUnitListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the customer's units as a flat list, newest last; assemble the tree from `parentExternalId` (`null` on the root unit, `isRoot: true`). Deleted units are hidden unless `status=DELETED` is given. Filter by `externalType`, or by `parentExternalId` for one level of the tree. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().listCustomerUnitsByExternalId(
    "customer_123",
    ListCustomerUnitsByExternalIdRequest
        .builder()
        .parentExternalId("dept-rnd")
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<ListCustomerUnitsByExternalIdRequestStatus>` — Filter by status (default ACTIVE).
    
</dd>
</dl>

<dl>
<dd>

**externalType:** `Optional<String>` — Filter by external type.
    
</dd>
</dl>

<dl>
<dd>

**parentExternalId:** `Optional<String>` — Your external ID of the parent unit; lists its direct children.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomerUnitByExternalId(externalId, request) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a unit for this customer. `externalId` is your own key for it: required, unique within the customer and immutable; every unit route addresses the unit by it, and `name` defaults to it. Omit `parentExternalId` to create the customer's root unit (its first unit; `409 ROOT_EXISTS` if it already has one — a customer created with an external id usable as a unit key already has its root, keyed by that external id, so name it as the parent instead); otherwise the parent must exist (`409 PARENT_NOT_FOUND`) and be ACTIVE. Units are never created implicitly: a signal that names a unit before it exists is accepted and its spend attaches to the unit once you create it with that key. `409` also when the externalId is taken (`CUSTOMER_UNIT_EXISTS`), the tree would get too deep, or the customer is on seat-based billing. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().createCustomerUnitByExternalId(
    "customer_123",
    CreateCustomerUnitByExternalIdRequest
        .builder()
        .body(
            CustomerUnitCreate
                .builder()
                .externalId("team-research")
                .build()
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUnitCreate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerUnitByExternalId(externalId, externalCustomerUnitId) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns one unit of this customer by its `externalId`, including a deleted one. `404` when the unit does not exist or belongs to another customer. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerUnitByExternalId(
    "customer_123",
    "team-research",
    GetCustomerUnitByExternalIdRequest
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteCustomerUnitByExternalId(externalId, externalCustomerUnitId) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Soft-deletes a unit: it stays readable with `status: DELETED` and cannot be reactivated. Spend history that references it is kept, and signals that keep naming it are still attributed to it. `409` while the unit has ACTIVE children or a cap in force or scheduled; the root follows the same rules, and once it is deleted a new root can be created. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().deleteCustomerUnitByExternalId(
    "customer_123",
    "team-research",
    DeleteCustomerUnitByExternalIdRequest
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.updateCustomerUnitByExternalId(externalId, externalCustomerUnitId, request) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Renames, re-types, re-parents or annotates a unit, the root included. `externalId` cannot change. Re-parenting (`parentExternalId`) moves the unit with everything under it. Spend already recorded keeps naming the unit it landed on; caps are evaluated on the current tree, so from the move on the unit's spend in the running cap period counts toward its new ancestors' caps and no longer toward the old ones. `409` for a deleted unit, a parent that does not exist or is not ACTIVE, a move of the root (`ROOT_UNIT_IMMOVABLE`), a move under the unit's own subtree, or a tree that would get too deep. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().updateCustomerUnitByExternalId(
    "customer_123",
    "team-research",
    UpdateCustomerUnitByExternalIdRequest
        .builder()
        .body(
            CustomerUnitUpdate
                .builder()
                .build()
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUnitUpdate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerUnits(id) -> CustomerUnitListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the customer's units as a flat list, newest last; assemble the tree from `parentExternalId` (`null` on the root unit, `isRoot: true`). Deleted units are hidden unless `status=DELETED` is given. Filter by `externalType`, or by `parentExternalId` for one level of the tree. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().listCustomerUnits(
    "cus_abc123",
    ListCustomerUnitsRequest
        .builder()
        .parentExternalId("dept-rnd")
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<ListCustomerUnitsRequestStatus>` — Filter by status (default ACTIVE).
    
</dd>
</dl>

<dl>
<dd>

**externalType:** `Optional<String>` — Filter by external type.
    
</dd>
</dl>

<dl>
<dd>

**parentExternalId:** `Optional<String>` — Your external ID of the parent unit; lists its direct children.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomerUnit(id, request) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a unit for this customer. `externalId` is your own key for it: required, unique within the customer and immutable; every unit route addresses the unit by it, and `name` defaults to it. Omit `parentExternalId` to create the customer's root unit (its first unit; `409 ROOT_EXISTS` if it already has one — a customer created with an external id usable as a unit key already has its root, keyed by that external id, so name it as the parent instead); otherwise the parent must exist (`409 PARENT_NOT_FOUND`) and be ACTIVE. Units are never created implicitly: a signal that names a unit before it exists is accepted and its spend attaches to the unit once you create it with that key. `409` also when the externalId is taken (`CUSTOMER_UNIT_EXISTS`), the tree would get too deep, or the customer is on seat-based billing. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().createCustomerUnit(
    "cus_abc123",
    CreateCustomerUnitRequest
        .builder()
        .body(
            CustomerUnitCreate
                .builder()
                .externalId("team-research")
                .build()
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUnitCreate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerUnit(id, externalCustomerUnitId) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns one unit of this customer by its `externalId`, including a deleted one. `404` when the unit does not exist or belongs to another customer. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerUnit(
    "cus_abc123",
    "team-research",
    GetCustomerUnitRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteCustomerUnit(id, externalCustomerUnitId) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Soft-deletes a unit: it stays readable with `status: DELETED` and cannot be reactivated. Spend history that references it is kept, and signals that keep naming it are still attributed to it. `409` while the unit has ACTIVE children or a cap in force or scheduled; the root follows the same rules, and once it is deleted a new root can be created. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().deleteCustomerUnit(
    "cus_abc123",
    "team-research",
    DeleteCustomerUnitRequest
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.updateCustomerUnit(id, externalCustomerUnitId, request) -> CustomerUnit</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Renames, re-types, re-parents or annotates a unit, the root included. `externalId` cannot change. Re-parenting (`parentExternalId`) moves the unit with everything under it. Spend already recorded keeps naming the unit it landed on; caps are evaluated on the current tree, so from the move on the unit's spend in the running cap period counts toward its new ancestors' caps and no longer toward the old ones. `409` for a deleted unit, a parent that does not exist or is not ACTIVE, a move of the root (`ROOT_UNIT_IMMOVABLE`), a move under the unit's own subtree, or a tree that would get too deep. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().updateCustomerUnit(
    "cus_abc123",
    "team-research",
    UpdateCustomerUnitRequest
        .builder()
        .body(
            CustomerUnitUpdate
                .builder()
                .build()
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUnitUpdate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerUnitCapByExternalId(externalId, externalCustomerUnitId) -> CustomerUnitCapResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the cap in force on this customer unit for one credits currency, with usage in the current period when available. Select the currency with `creditsCurrencyId`; it may be omitted only when the organization has exactly one credits currency, which is then used and echoed back. `404` when the customer or the unit does not exist, or the unit has no cap in force for that currency. The usage figures are advisory: other spend may land between this read and the next burn. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerUnitCapByExternalId(
    "customer_123",
    "tenant-a",
    GetCustomerUnitCapByExternalIdRequest
        .builder()
        .creditsCurrencyId("7f4f5d4c-55e9-4d5b-a3e7-c9eb3d2d01bf")
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**creditsCurrencyId:** `Optional<String>` — The credits currency to read. Omit it only when the organization has exactly one credits currency, which is then used; otherwise it is required.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.setCustomerUnitCapByExternalId(externalId, externalCustomerUnitId, request) -> CustomerUnitCapSetResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Sets the cap on this customer unit for one credits currency by recording a new cap version; earlier versions are kept and never modified, and the newest version wins where they overlap. The new version applies from `effectiveFrom` (default now) and its periods are anchored on that day of the month. Select the currency with `creditsCurrencyId` in the body; it may be omitted only when the organization has exactly one credits currency. A cap on the customer's root unit is the customer-wide cap. `404` when the customer or the unit does not exist. `409` for customers on seat-based billing. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().setCustomerUnitCapByExternalId(
    "customer_123",
    "tenant-a",
    SetCustomerUnitCapByExternalIdRequest
        .builder()
        .body(
            CustomerUnitCapSet
                .builder()
                .amount(10000)
                .build()
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUnitCapSet` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.endCustomerUnitCapByExternalId(externalId, externalCustomerUnitId) -> CustomerUnitCapEndResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Ends the cap on this customer unit for one credits currency by setting `effectiveUntil` to now on every open version — the one in force, older overlapping versions still open, and versions scheduled to start later — so nothing can resurface or activate afterwards; nothing is deleted and history is kept. Select the currency with `creditsCurrencyId`; it may be omitted only when the organization has exactly one credits currency. `404` when the customer or the unit does not exist, or there is no open version for that currency. Addresses the customer by your external customer id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().endCustomerUnitCapByExternalId(
    "customer_123",
    "tenant-a",
    EndCustomerUnitCapByExternalIdRequest
        .builder()
        .creditsCurrencyId("7f4f5d4c-55e9-4d5b-a3e7-c9eb3d2d01bf")
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

**externalId:** `String` — Customer ID from your system, stored on Paid as the customer's `externalId`.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**creditsCurrencyId:** `Optional<String>` — The credits currency whose cap to end. Omit it only when the organization has exactly one credits currency, which is then used; otherwise it is required.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerUnitCap(id, externalCustomerUnitId) -> CustomerUnitCapResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the cap in force on this customer unit for one credits currency, with usage in the current period when available. Select the currency with `creditsCurrencyId`; it may be omitted only when the organization has exactly one credits currency, which is then used and echoed back. `404` when the customer or the unit does not exist, or the unit has no cap in force for that currency. The usage figures are advisory: other spend may land between this read and the next burn. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().getCustomerUnitCap(
    "cus_abc123",
    "tenant-a",
    GetCustomerUnitCapRequest
        .builder()
        .creditsCurrencyId("7f4f5d4c-55e9-4d5b-a3e7-c9eb3d2d01bf")
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**creditsCurrencyId:** `Optional<String>` — The credits currency to read. Omit it only when the organization has exactly one credits currency, which is then used; otherwise it is required.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.setCustomerUnitCap(id, externalCustomerUnitId, request) -> CustomerUnitCapSetResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Sets the cap on this customer unit for one credits currency by recording a new cap version; earlier versions are kept and never modified, and the newest version wins where they overlap. The new version applies from `effectiveFrom` (default now) and its periods are anchored on that day of the month. Select the currency with `creditsCurrencyId` in the body; it may be omitted only when the organization has exactly one credits currency. A cap on the customer's root unit is the customer-wide cap. `404` when the customer or the unit does not exist. `409` for customers on seat-based billing. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().setCustomerUnitCap(
    "cus_abc123",
    "tenant-a",
    SetCustomerUnitCapRequest
        .builder()
        .body(
            CustomerUnitCapSet
                .builder()
                .amount(10000)
                .build()
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomerUnitCapSet` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.endCustomerUnitCap(id, externalCustomerUnitId) -> CustomerUnitCapEndResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Ends the cap on this customer unit for one credits currency by setting `effectiveUntil` to now on every open version — the one in force, older overlapping versions still open, and versions scheduled to start later — so nothing can resurface or activate afterwards; nothing is deleted and history is kept. Select the currency with `creditsCurrencyId`; it may be omitted only when the organization has exactly one credits currency. `404` when the customer or the unit does not exist, or there is no open version for that currency. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customers().endCustomerUnitCap(
    "cus_abc123",
    "tenant-a",
    EndCustomerUnitCapRequest
        .builder()
        .creditsCurrencyId("7f4f5d4c-55e9-4d5b-a3e7-c9eb3d2d01bf")
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

**id:** `String` — Paid customer display id
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
</dd>
</dl>

<dl>
<dd>

**creditsCurrencyId:** `Optional<String>` — The credits currency whose cap to end. Omit it only when the organization has exactly one credits currency, which is then used; otherwise it is required.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Contacts
<details><summary><code>client.contacts.listContacts() -> ContactListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a list of contacts for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().listContacts(
    ListContactsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.createContact(request) -> Contact</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new contact for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().createContact(
    CreateContactRequest
        .builder()
        .customerId("customerId")
        .email("email")
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

**firstName:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**lastName:** `Optional<String>` 
    
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

**billingAddress:** `Optional<ContactBillingAddress>` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**roles:** `Optional<List<CreateContactRequestRolesItem>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.getContactById(id) -> Contact</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a contact by its ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().getContactById(
    "id",
    GetContactByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.updateContactById(id, request) -> Contact</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a contact by its ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().updateContactById(
    "id",
    UpdateContactByIdRequest
        .builder()
        .body(
            UpdateContactRequest
                .builder()
                .build()
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `UpdateContactRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.deleteContactById(id) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a contact by its ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().deleteContactById(
    "id",
    DeleteContactByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.getContactByExternalId(externalId) -> Contact</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a contact by its external ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().getContactByExternalId(
    "externalId",
    GetContactByExternalIdRequest
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
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.updateContactByExternalId(externalId, request) -> Contact</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a contact by its external ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().updateContactByExternalId(
    "externalId",
    UpdateContactByExternalIdRequest
        .builder()
        .body(
            UpdateContactRequest
                .builder()
                .build()
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

**request:** `UpdateContactRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contacts.deleteContactByExternalId(externalId) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a contact by its external ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contacts().deleteContactByExternalId(
    "externalId",
    DeleteContactByExternalIdRequest
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
</dd>
</dl>


</dd>
</dl>
</details>

## Orders
<details><summary><code>client.orders.listOrders() -> OrderListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a list of orders for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().listOrders(
    ListOrdersRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Filter by customer ID.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Filter by customer external ID.
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` — Filter by the order's external ID (exact match).
    
</dd>
</dl>

<dl>
<dd>

**creationState:** `Optional<ListOrdersRequestCreationState>` — Filter by creation state: draft or active.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<OrderStatusFilter>` — Filter by derived order status. draft: not yet activated. paused: billing is paused. ended: end date is in the past. active: activated, not paused, and not ended.
    
</dd>
</dl>

<dl>
<dd>

**startDateFrom:** `Optional<String>` — Only orders whose start date is on or after this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**startDateTo:** `Optional<String>` — Only orders whose start date is on or before this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**endDateFrom:** `Optional<String>` — Only orders whose end date is on or after this date. Orders without an end date are not matched. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**endDateTo:** `Optional<String>` — Only orders whose end date is on or before this date. Orders without an end date are not matched. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.createOrder(request) -> Order</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new order for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().createOrder(
    CreateOrderRequest
        .builder()
        .customerId("customerId")
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

**billingCustomerId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingContactIds:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**subscriptionTerms:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**creationState:** `Optional<OrderCreationState>` 
    
</dd>
</dl>

<dl>
<dd>

**billingAnchor:** `Optional<Integer>` — Day of month for billing anchor (1-31). Defaults to start date day if not provided.
    
</dd>
</dl>

<dl>
<dd>

**paymentTerms:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**autoPostInvoices:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**autoSendBillingEmails:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**autoSendPaymentEmails:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**lines:** `Optional<List<CreateOrderLineRequest>>` 
    
</dd>
</dl>

<dl>
<dd>

**billingFrequencyOverride:** `Optional<OrderBillingFrequencyOverride>` 
    
</dd>
</dl>

<dl>
<dd>

**purchaseOrderReference:** `Optional<String>` — Purchase order number printed on invoices generated from this order.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.getOrderById(id) -> Order</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get an order by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().getOrderById(
    "id",
    GetOrderByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.updateOrderById(id, request) -> Order</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update an order by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().updateOrderById(
    "id",
    UpdateOrderRequest
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**subscriptionTerms:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**creationState:** `Optional<OrderCreationState>` 
    
</dd>
</dl>

<dl>
<dd>

**billingAnchor:** `Optional<Integer>` — Day of month for billing anchor (1-31). Defaults to start date day if not provided.
    
</dd>
</dl>

<dl>
<dd>

**paymentTerms:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**billingCustomerId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**billingContactIds:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**autoPostInvoices:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**autoSendBillingEmails:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**autoSendPaymentEmails:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**purchaseOrderReference:** `Optional<String>` — Purchase order number printed on invoices generated from this order.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.deleteOrderById(id) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete an order by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().deleteOrderById(
    "id",
    DeleteOrderByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.activateOrderById(id) -> Order</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Activate a draft order by ID. Activation starts billing for the order using the same validation and side effects as the dashboard activation flow.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().activateOrderById(
    "id",
    ActivateOrderByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.getOrderLines(id) -> OrderLinesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the order lines for an order by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().getOrderLines(
    "id",
    GetOrderLinesRequest
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.listOrderSeats(id) -> OrderSeatListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List seats for an order
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().listOrderSeats(
    "id",
    ListOrderSeatsRequest
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**productExternalId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<ListOrderSeatsRequestStatus>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.updateOrderSeatAssignment(id, seatId, request) -> OrderSeat</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Assign or unassign a single seat on an order
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().updateOrderSeatAssignment(
    "id",
    "seatId",
    UpdateSeatAssignmentRequest
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**seatId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**userExternalId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.orders.batchOrderSeatAssignments(id, request) -> BatchSeatAssignmentsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Assign or unassign seats in batch for an order
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.orders().batchOrderSeatAssignments(
    "id",
    BatchSeatAssignmentsRequest
        .builder()
        .assignments(
            new ArrayList<BatchSeatAssignmentsRequestAssignmentsItem>(
                Arrays.asList(
                    BatchSeatAssignmentsRequestAssignmentsItem
                        .builder()
                        .seatId("seatId")
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**assignments:** `List<BatchSeatAssignmentsRequestAssignmentsItem>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoices
<details><summary><code>client.invoices.listInvoices() -> InvoiceListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a list of invoices for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoices().listInvoices(
    ListInvoicesRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Filter by customer ID.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Filter by customer external ID.
    
</dd>
</dl>

<dl>
<dd>

**orderId:** `Optional<String>` — Filter by the order this invoice was generated from.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<ListInvoicesRequestStatus>` — Filter by invoice status.
    
</dd>
</dl>

<dl>
<dd>

**paymentStatus:** `Optional<ListInvoicesRequestPaymentStatus>` — Filter by payment status.
    
</dd>
</dl>

<dl>
<dd>

**issueDateFrom:** `Optional<String>` — Only invoices whose issue date is on or after this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**issueDateTo:** `Optional<String>` — Only invoices whose issue date is on or before this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**dueDateFrom:** `Optional<String>` — Only invoices whose due date is on or after this date. Invoices without a due date are not matched. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**dueDateTo:** `Optional<String>` — Only invoices whose due date is on or before this date. Invoices without a due date are not matched. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**displayNumber:** `Optional<String>` — Filter by the invoice number shown on the invoice, whether draft or posted (exact match).
    
</dd>
</dl>

<dl>
<dd>

**purchaseOrderReference:** `Optional<String>` — Filter by purchase order reference (exact match, whitespace-sensitive).
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<String>` — Filter by invoice currency code (case-insensitive, e.g. USD).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoices.getInvoiceById(id) -> Invoice</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get an invoice by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoices().getInvoiceById(
    "id",
    GetInvoiceByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoices.updateInvoiceById(id, request) -> Invoice</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update an invoice by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoices().updateInvoiceById(
    "id",
    UpdateInvoiceRequest
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoices.getInvoiceLines(id) -> InvoiceLinesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the invoice lines for an invoice by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoices().getInvoiceLines(
    "id",
    GetInvoiceLinesRequest
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Signals
<details><summary><code>client.signals.listSignals() -> SignalListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns ingested signals (usage events) for your organization, newest first. Filter by signal name, customer, product, and creation date range.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.signals().listSignals(
    ListSignalsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**signalName:** `Optional<String>` — Filter by signal event name (exact match).
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Filter by the Paid customer ID the signal is attributed to.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Filter by your external customer ID. Aliases resolve to the attributed customer, and unresolved IDs match raw ingest data.
    
</dd>
</dl>

<dl>
<dd>

**productId:** `Optional<String>` — Filter by the Paid product ID the signal is attributed to.
    
</dd>
</dl>

<dl>
<dd>

**externalProductId:** `Optional<String>` — Filter by your external product ID.
    
</dd>
</dl>

<dl>
<dd>

**createdAtFrom:** `Optional<String>` — Only signals created on or after this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**createdAtTo:** `Optional<String>` — Only signals created on or before this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.signals.getSignalById(id) -> SignalListItem</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a single ingested signal (usage event) by its ID, including the data payload submitted at ingest.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.signals().getSignalById(
    "6890b0e2a6f2c30012f0a1b3",
    GetSignalByIdRequest
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

**id:** `String` — Signal ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.signals.createSignals(request) -> BulkSignalsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create multiple signals (usage events) in a single request. Each signal must include a customer attribution (either customerId or externalCustomerId) and a product attribution (either productId or externalProductId).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.signals().createSignals(
    BulkSignalsRequest
        .builder()
        .signals(
            new ArrayList<Signal>(
                Arrays.asList(
                    Signal
                        .builder()
                        .eventName("eventName")
                        .customer(
                            CustomerAttribution.ofCustomerById(
                                CustomerById
                                    .builder()
                                    .customerId("customerId")
                                    .build()
                            )
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

**signals:** `List<Signal>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Credits
<details><summary><code>client.credits.listCreditCurrencies() -> CreditCurrencyListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List credit currencies for the organization. Includes active and archived currencies by default; use the status query parameter to filter.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credits().listCreditCurrencies(
    ListCreditCurrenciesRequest
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

**status:** `Optional<ListCreditCurrenciesRequestStatus>` — Filter credit currencies by status. Defaults to `all` so archived currencies remain readable after they are archived.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.credits.createCreditCurrency(request) -> CreditCurrency</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a credit currency for the organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credits().createCreditCurrency(
    CreateCreditCurrencyRequest
        .builder()
        .name("API Credits")
        .key("api_credits")
        .description("Credits consumed by API calls.")
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

**name:** `String` — Human-readable name shown for this credit currency.
    
</dd>
</dl>

<dl>
<dd>

**key:** `String` — Stable machine-readable key for this credit currency. Use lowercase letters, numbers, underscores, and hyphens. Keys are unique within an organization.
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — Optional description for this credit currency.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.credits.listCreditTransactions() -> CreditTransactionListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List credit ledger transactions (grants, spends, and pending grants) for the organization, newest first. Filter by customer, credit currency, type, order, or date range.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credits().listCreditTransactions(
    ListCreditTransactionsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Filter by customer ID.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Filter by customer external ID.
    
</dd>
</dl>

<dl>
<dd>

**creditsCurrencyId:** `Optional<String>` — Filter by credit currency ID.
    
</dd>
</dl>

<dl>
<dd>

**creditCurrencyKey:** `Optional<String>` — Filter by the stable machine-readable key of the credit currency.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<ListCreditTransactionsRequestType>` — Filter by transaction type.
    
</dd>
</dl>

<dl>
<dd>

**orderId:** `Optional<String>` — Filter by the order this transaction is linked to.
    
</dd>
</dl>

<dl>
<dd>

**createdAtFrom:** `Optional<String>` — Only transactions recorded on or after this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**createdAtTo:** `Optional<String>` — Only transactions recorded on or before this date. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.credits.updateCreditCurrencyById(id, request) -> CreditCurrency</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a credit currency description or set its active/archive status.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credits().updateCreditCurrencyById(
    "7f4f5d4c-55e9-4d5b-a3e7-c9eb3d2d01bf",
    UpdateCreditCurrencyRequest
        .builder()
        .description("Credits consumed by developer API calls.")
        .status(UpdateCreditCurrencyRequestStatus.ARCHIVED)
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

**id:** `String` — Credit currency ID.
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — Updated description for this credit currency. Use null to clear the description.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<UpdateCreditCurrencyRequestStatus>` — Set to `archived` to archive this credit currency, or `active` to restore it.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Checkouts
<details><summary><code>client.checkouts.listCheckouts() -> CheckoutListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a list of checkouts for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.checkouts().listCheckouts(
    ListCheckoutsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<ListCheckoutsRequestStatus>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.checkouts.createCheckout(request) -> Checkout</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a checkout link that generates a URL for a customer to complete a purchase
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.checkouts().createCheckout(
    CreateCheckoutRequest
        .builder()
        .products(
            new ArrayList<CheckoutProductInput>(
                Arrays.asList(
                    CheckoutProductInput
                        .builder()
                        .id("id")
                        .build()
                )
            )
        )
        .successUrl("successUrl")
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

**products:** `List<CheckoutProductInput>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — External customer identifier. Creates the customer on first use, resolves to the existing customer on subsequent uses.
    
</dd>
</dl>

<dl>
<dd>

**successUrl:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cancelUrl:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**collectAddress:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**collectPhone:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**singleUse:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<String>` — Lock checkout to a specific currency. Omit to allow all currencies supported by the selected plans. If the checkout is for a customer with an active subscription, the currency must match that subscription's currency — subscriptions cannot change currency.
    
</dd>
</dl>

<dl>
<dd>

**customCards:** `Optional<List<CheckoutCustomCardInput>>` — Additional informational pricing cards rendered alongside the plans.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.checkouts.getCheckout(id) -> CheckoutDetails</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a checkout by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.checkouts().getCheckout(
    "id",
    GetCheckoutRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.checkouts.archiveCheckout(id) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Archive a checkout by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.checkouts().archiveCheckout(
    "id",
    ArchiveCheckoutRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## CustomerPortals
<details><summary><code>client.customerPortals.createCustomerPortal(request) -> CustomerPortal</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a portal session for the customer. Returns a short-lived URL to the customer portal.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerPortals().createCustomerPortal(
    CreateCustomerPortalRequest
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

**customerId:** `Optional<String>` — The Paid customer ID (display ID or UUID). Either this or externalCustomerId must be provided.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Your external customer ID. Either this or customerId must be provided.
    
</dd>
</dl>

<dl>
<dd>

**returnUrl:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ValueReceipts
<details><summary><code>client.valueReceipts.listValueReceipts() -> ValueReceiptListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List value receipts for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().listValueReceipts(
    ListValueReceiptsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Filter by customer display ID.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Filter by customer external ID.
    
</dd>
</dl>

<dl>
<dd>

**orderId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**productId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**archived:** `Optional<ListValueReceiptsRequestArchived>` — Include archived value receipts. Defaults to false.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.createValueReceipt(request) -> ValueReceiptSyncResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a value receipt for a customer and date range, optionally scoped to a product or an order. Every call creates a receipt, so calling twice for the same period gives the customer two. The date range must have ended; a range with nothing delivered in it reports zero. Returns the receipt's ID and public URL.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().createValueReceipt(
    SyncValueReceiptRequest
        .builder()
        .startDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .endDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
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

**request:** `SyncValueReceiptRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.syncValueReceipt(request) -> ValueReceiptSyncResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deprecated — use POST /value-receipts. Returns the receipt this customer already has for the date range (200), refreshed with current data, and creates one only if there is none (201), so calling twice does not give the customer two receipts.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().syncValueReceipt(
    SyncValueReceiptRequest
        .builder()
        .startDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .endDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
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

**request:** `SyncValueReceiptRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.getValueReceiptById(id) -> ValueReceiptDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a value receipt by ID, including its publish/share state.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().getValueReceiptById(
    "id",
    GetValueReceiptByIdRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.refreshValueReceipt(id, request) -> ValueReceiptSyncResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Re-populate an existing draft value receipt with current data inline. Returns the slim sync response. Sealed VRs cannot be refreshed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().refreshValueReceipt(
    "id",
    RefreshValueReceiptRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.sealValueReceipt(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Transition a draft value receipt to sealed (posted) status. Sealed VRs are immutable — they cannot be updated or re-populated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().sealValueReceipt(
    "id",
    SealValueReceiptRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.archiveValueReceipt(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Soft-archive a value receipt. Archived VRs are hidden from list by default.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().archiveValueReceipt(
    "id",
    ArchiveValueReceiptRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.unarchiveValueReceipt(id, request) -> SuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Restore an archived value receipt.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().unarchiveValueReceipt(
    "id",
    UnarchiveValueReceiptRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.publishValueReceipt(id, request) -> ValueReceiptDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Make a value receipt publicly accessible via URL. An archived receipt is rejected with 409 — unarchive it first.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().publishValueReceipt(
    "id",
    PublishValueReceiptBody
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**publishExpiresAt:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueReceipts.unpublishValueReceipt(id, request) -> ValueReceiptDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Revoke public access to a value receipt. Available for archived receipts too, so a live link can always be revoked.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueReceipts().unpublishValueReceipt(
    "id",
    UnpublishValueReceiptRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Webhooks
<details><summary><code>client.webhooks.listWebhooks() -> WebhookListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List customer-facing billing webhooks for the authenticated organization, along with whether the organization has generated a signing secret.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().listWebhooks();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.updateWebhook(webhookName, request) -> WebhookUpdateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Enable or disable a webhook and configure the destination URL for the authenticated organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().updateWebhook(
    UpdateWebhookRequestWebhookName.BILLING_INVOICE_CREATED,
    UpdateWebhookRequest
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

**webhookName:** `UpdateWebhookRequestWebhookName` 
    
</dd>
</dl>

<dl>
<dd>

**enabled:** `Optional<Boolean>` — Whether the webhook is enabled for delivery.
    
</dd>
</dl>

<dl>
<dd>

**url:** `Optional<String>` — The HTTPS endpoint Paid should deliver this webhook to. Set to null to clear it while disabled.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.testWebhook(webhookName, request) -> WebhookTestResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Send a synthetic webhook delivery to the configured destination for this webhook.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().testWebhook(
    TestWebhookRequestWebhookName.BILLING_INVOICE_CREATED,
    TestWebhookRequest
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

**webhookName:** `TestWebhookRequestWebhookName` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.rotateWebhookSecret(request) -> RotateWebhookSecretResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a new HMAC signing secret used by every webhook in this organization and return it exactly once. The previous secret is invalidated immediately on next delivery.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().rotateWebhookSecret(
    RotateWebhookSecretRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Pricing
<details><summary><code>client.pricing.listPricing() -> PricingListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns pricing for all product attributes of a product. Each entry includes the attribute's pricing configuration and credit benefits.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pricing().listPricing(
    ListPricingRequest
        .builder()
        .productId("productId")
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

**productId:** `String` — Product display ID or UUID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pricing.getPricing(productAttributeId) -> PricingResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns pricing and credit benefits for a single product attribute.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pricing().getPricing(
    "productAttributeId",
    GetPricingRequest
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

**productAttributeId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pricing.updatePricing(productAttributeId, request) -> PricingResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates pricing on an existing product attribute. To create a new attribute, use the update product endpoint (updateProductById), which upserts productAttributes. If creditBenefits is provided, it fully replaces existing benefits. If omitted, existing benefits are preserved.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pricing().updatePricing(
    "productAttributeId",
    UpdatePricingRequest
        .builder()
        .pricing(
            PricingInput.recurringPerUnit(
                RecurringPerUnitInput
                    .builder()
                    .billingFrequency(RecurringPerUnitInputBillingFrequency.MONTHLY)
                    .pricePoints(
                        new ArrayList<SimplePricePoint>(
                            Arrays.asList(
                                SimplePricePoint
                                    .builder()
                                    .currency("currency")
                                    .unitPrice(1)
                                    .build()
                            )
                        )
                    )
                    .build()
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

**productAttributeId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**pricing:** `PricingInput` 
    
</dd>
</dl>

<dl>
<dd>

**creditBenefits:** `Optional<List<CreditBenefitInput>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Costs
<details><summary><code>client.costs.createCosts(request) -> CostIngestResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Ingests a batch of cost records. Each record is either a pre-computed `cost` (caller supplies amount + currency) or a `usage` record (caller supplies vendor/model/token counts and Paid prices it server-side). The batch is all-or-nothing: if any record fails validation, the entire request is rejected with a 400 and nothing is persisted.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.costs().createCosts(
    CostIngestRequest
        .builder()
        .costs(
            new ArrayList<Cost>(
                Arrays.asList(
                    Cost.cost(
                        PrecomputedCost
                            .builder()
                            .customer(
                                CustomerAttribution.ofCustomerById(
                                    CustomerById
                                        .builder()
                                        .customerId("customerId")
                                        .build()
                                )
                            )
                            .amount(1.1)
                            .currency("currency")
                            .build()
                    )
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

**costs:** `List<Cost>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Analytics
<details><summary><code>client.analytics.executeAnalyticsQuery(request) -> AnalyticsQueryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Runs a single ClickHouse SELECT (or WITH … SELECT) against your organization's analytics views. Before writing a query, call `getAnalyticsSchema` (GET /schema) for the available views and columns, and `getSignalsMetadata` (GET /signals/metadata) for the JSON paths inside `fact_signal.data`. Results are automatically scoped to your organization — no org filter is needed or possible. Only SELECT/WITH statements are accepted.

Conventions: monetary amounts are minor units (cents — divide by 100 for the major unit); most are integers, but `fact_cost.cost_amount` is fractional cents (Decimal) since a single AI call usually costs less than a cent; 64-bit integers (counts, ids, amounts) are returned as JSON strings to preserve precision, so parse them client-side; Decimal columns (fractional cents, and credit amounts, which are counts of credits rather than cents and are never divided by 100) come back as JSON numbers instead, so a value beyond 2^53 is already rounded — select toString(col) when you need its exact digits. Query signal payloads via JSON paths, e.g. `SELECT data.country::String AS country, count() FROM fact_signal GROUP BY country`.

Limits: 30 seconds of execution time and 10,000 result rows (truncation is flagged via `meta.truncated`). Prefer aggregates and a `created_at` date filter on large tables — this endpoint is for interactive analytics, not bulk export.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.analytics().executeAnalyticsQuery(
    AnalyticsQueryRequest
        .builder()
        .query("SELECT signal_name, count() AS signals FROM fact_signal WHERE created_at > now() - INTERVAL 30 DAY GROUP BY signal_name ORDER BY signals DESC")
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

**request:** `AnalyticsQueryRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.analytics.getAnalyticsSchema() -> AnalyticsSchemaResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the analytics views available to POST /query, with column names, ClickHouse types, and descriptions. Dimensions (`dim_*`) describe entities; facts (`fact_*`) are event/transaction tables that join to dimensions via the `*_id` columns described in each comment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.analytics().getAnalyticsSchema();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.analytics.getSignalsMetadata() -> SignalsMetadataResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the JSON paths (and their observed types) present in the `data` payload of your signals within a time window (default: last 30 days), grouped by signal name. Use the returned paths in queries against `fact_signal`, e.g. `WHERE data.<path>::String = '...'`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.analytics().getSignalsMetadata(
    GetSignalsMetadataRequest
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

**signalName:** `Optional<String>` — Restrict discovery to a single signal name.
    
</dd>
</dl>

<dl>
<dd>

**fromDate:** `Optional<OffsetDateTime>` — Start of the discovery window. Defaults to 30 days ago.
    
</dd>
</dl>

<dl>
<dd>

**toDate:** `Optional<OffsetDateTime>` — End of the discovery window. Defaults to now.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## CustomViewsExperimental
<details><summary><code>client.customViewsExperimental.listCustomViews() -> CustomViewListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

Lists the organization's custom views (newest first) with lightweight summary info — name, status, query count, default date range, created date. Does not return the SQL or render bundle; fetch a single view via getCustomView for those.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().listCustomViews();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customViewsExperimental.createCustomView(request) -> CustomView</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

⚠️ Only call this when the user has EXPLICITLY asked to save or create the view. After generating or previewing a dashboard, do NOT automatically save it — show it to the user and wait for them to ask you to save it. A customer-scoped view is created as a DRAFT — creating it is NOT permission to publish; never chain a publish onto a create. An organization-scoped view is created already PUBLISHED instead: it has no draft state and no publish step at all (never call publishCustomView on one — it's a no-op, and unpublishView refuses it outright). After saving, hand the user the previewUrl and wait for their feedback before doing anything else. Saves named analytics queries + a self-contained HTML render bundle. **Call getCustomViewAuthoringGuide (GET /experimental/views/authoring-guide) first** — it returns the full guide and a copy-paste interactive template. Key rules: (1) Do NOT add a customer filter to the SQL — the database scopes every query to the viewing customer at embed time. (2) Each query's SQL must be SELECT-only; return clearly-named columns. Compute metric VALUES in SQL (e.g. (count()*2)/5 AS custom_metric) — derive a number in the render bundle only when it depends on user interaction (toggle/filter/hover) or is pure formatting of a value a query already returns. (3) The render bundle must be SELF-CONTAINED — inline all CSS/JS/charting, NO external loads or fetch (the sandbox has connect-src 'none'); it must listen for the `paid:data` message (data keyed by query id) and re-render on each one. (4) Make it INTERACTIVE — mousemove hover tooltips and at least one addEventListener-wired control that re-renders (a static chart feels broken). (5) The render bundle is the single source of truth — BEFORE saving, preview the EXACT bundle in the user's current client (call getCustomViewPreviewHarness with your bundle + sample data and render the HTML it returns) and show it to the user; that preview in the current client is how the user first sees the dashboard. Do NOT save a draft just to preview it in Paid — creating writes to the user's real account and is never a preview step. Do NOT build a separate chart, and only show numbers that come from a declared query. (6) A view is a FULL dashboard — include as many charts/KPIs as the analysis has. Keep every element derived from the single viewing customer (KPIs, trends, type mix); drop only cross-customer comparisons (rankings, share-of-total, 'N customers'). Don't simplify to one chart. (7) To make the date range adjustable (e.g. the user says 'last month'), write the date boundary as `{period_start:DateTime}` / `{period_end:DateTime}` placeholders in the SQL and pass a default `period` (relative like {kind:'relative',unit:'month',amount:1}, or absolute start/end). The org user can then change it in Paid without re-authoring. A query using the placeholders REQUIRES a period. Do NOT add your own date-range picker to the render bundle — Paid owns the timeframe and the bundle receives already-filtered data; a second in-bundle picker cannot re-run the SQL. (8) Check your draft with validateCustomView (POST /experimental/views/validate) BEFORE asking the user to save — it runs these same gates without persisting and reports every problem at once. The response returns a `previewUrl` — give it to the user so they can open the new view in Paid.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().createCustomView(
    CreateCustomViewRequest
        .builder()
        .name("Usage over time")
        .queries(
            new ArrayList<CustomViewQuery>(
                Arrays.asList(
                    CustomViewQuery
                        .builder()
                        .id("usage")
                        .sql("SELECT toDate(created_at) AS day, count() AS signals FROM fact_signal GROUP BY day ORDER BY day")
                        .build()
                )
            )
        )
        .renderBundle("<!doctype html><body>…</body>")
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

**name:** `String` — Human-readable view name (shown in preview + audit log).
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — Optional longer description of what the view shows.
    
</dd>
</dl>

<dl>
<dd>

**queries:** `List<CustomViewQuery>` — One or more named queries. Each becomes a separately-keyed result set in the embed.
    
</dd>
</dl>

<dl>
<dd>

**renderBundle:** `String` — Self-contained HTML document that renders the result sets. Inline ALL CSS/JS/charting libraries — the render sandbox has no network access. It receives the keyed result sets via a `message` event (`data[<queryId>]`) and must not fetch anything itself.
    
</dd>
</dl>

<dl>
<dd>

**period:** `Optional<CreateCustomViewRequestPeriod>` — Optional default date range. Required if any query uses the `{period_start:DateTime}` / `{period_end:DateTime}` placeholders. Can be changed later in Paid without re-authoring.
    
</dd>
</dl>

<dl>
<dd>

**filters:** `Optional<List<CustomViewFilter>>` — Optional per-request filter parameters. Required for every {filter_<name>:String} placeholder the queries reference.
    
</dd>
</dl>

<dl>
<dd>

**scope:** `Optional<CreateCustomViewRequestScope>` — 'customer' (default): data is scoped to one viewing customer and the view is embeddable per-customer. 'organization': data is org-wide; the view is internal-only (visible to org members in Paid, never embeddable).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customViewsExperimental.publishCustomView(displayId, request) -> CustomView</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

⚠️ Never publish as an automatic follow-up to creating or generating a view. Only call this after you have shown the user the built/previewed view and they have EXPLICITLY approved publishing — building and publishing are separate user decisions, and answering an earlier question (e.g. the view's scope) is NOT publish approval. Flips the view from DRAFT to PUBLISHED. Only PUBLISHED views are served on the embed data path — this is the gate that stops an unreviewed view reaching end-customers. Idempotent: publishing an already-published view is a no-op success. The response returns a `previewUrl` — give it to the user so they can open the view in Paid.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().publishCustomView(
    "displayId",
    PublishCustomViewRequest
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

**displayId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customViewsExperimental.updateCustomViewPeriod(displayId, request) -> CustomView</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

Updates the view's default date range (the period applied to queries that use the `{period_start:DateTime}` / `{period_end:DateTime}` placeholders). Accepts a relative rolling window (e.g. last 30 days) or a fixed start/end range. Lets the period be changed after deployment without re-authoring the SQL. Applies to DRAFT or PUBLISHED views.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().updateCustomViewPeriod(
    "displayId",
    UpdateCustomViewPeriodRequest
        .builder()
        .period(
            UpdateCustomViewPeriodRequestPeriod
                .builder()
                .kind(UpdateCustomViewPeriodRequestPeriodKind.RELATIVE)
                .build()
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

**displayId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**period:** `UpdateCustomViewPeriodRequestPeriod` — Default date range for the view's queries. Use `{period_start:DateTime}` / `{period_end:DateTime}` placeholders in your SQL to make the range adjustable. Either relative (unit+amount) or absolute (start+end).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customViewsExperimental.getCustomView(displayId) -> CustomViewDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

Returns the view's name, status, query ids, and the author render bundle for the owning organization (DRAFT or PUBLISHED). Used by the trusted preview/embed frame to render the sandbox; the per-customer data is fetched separately via /:displayId/data.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().getCustomView(
    "displayId",
    GetCustomViewRequest
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

**displayId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customViewsExperimental.updateCustomView(displayId, request) -> CustomView</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

Partially updates a view. Omitted fields are left unchanged. For REVISIONS, prefer the incremental fields — `bundleEdits` (exact search-and-replace on the stored render bundle) and `queryUpserts`/`queryRemovals` (per-query changes) — so you transmit only what changed instead of re-sending the whole payload. The full-replacement fields remain for rewrites: `renderBundle`, and `queries` (a FULL replacement of the query list — never drop queries the user didn't ask to remove). Replacement and incremental forms of the same aspect cannot be combined. The resulting SQL and bundle pass the same validation as createCustomView (SELECT-only, size cap, self-contained, paid:data listener). Works on DRAFT or PUBLISHED views — published embeds pick the change up on their next load.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().updateCustomView(
    "displayId",
    UpdateCustomViewRequest
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

**displayId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — New human-readable view name.
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — New description; pass null to clear it.
    
</dd>
</dl>

<dl>
<dd>

**queries:** `Optional<List<CustomViewQuery>>` — Full replacement of the view's query list. Each SQL is re-validated (SELECT-only) exactly like createCustomView. For changing one or two queries, prefer `queryUpserts`/`queryRemovals` instead. Cannot be combined with them.
    
</dd>
</dl>

<dl>
<dd>

**renderBundle:** `Optional<String>` — Replacement render bundle. Re-validated (size cap, self-contained, paid:data listener) exactly like createCustomView. For small changes, prefer `bundleEdits` instead. Cannot be combined with `bundleEdits`.
    
</dd>
</dl>

<dl>
<dd>

**bundleEdits:** `Optional<List<RenderBundleEdit>>` — PREFERRED for revisions: exact search-and-replace edits applied in order to the stored render bundle, so you send only the changed text instead of re-transmitting the whole bundle. The edited result passes the same validation as a full replacement. Cannot be combined with `renderBundle`.
    
</dd>
</dl>

<dl>
<dd>

**queryUpserts:** `Optional<List<CustomViewQuery>>` — PREFERRED for revisions: per-query changes — each entry replaces the stored query with the same id, or is appended as a new query. Queries not mentioned are left unchanged. Cannot be combined with `queries`.
    
</dd>
</dl>

<dl>
<dd>

**queryRemovals:** `Optional<List<String>>` — Ids of stored queries to remove (applied before `queryUpserts`). Rejected if an id does not exist. Cannot be combined with `queries`.
    
</dd>
</dl>

<dl>
<dd>

**filters:** `Optional<List<CustomViewFilter>>` — Full replacement of the view's declared filter parameters; pass null to remove them all. Every {filter_<name>:String} placeholder the (resulting) queries reference must stay declared.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customViewsExperimental.getCustomViewData(displayId) -> ViewDataResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

Runs every stored query of the view on the read-only analytics database and returns the result sets keyed by query id. For a customer-scoped view (the default), the query is scoped to the caller's organization AND the given `customerId` (both enforced as ClickHouse row filters) — `customerId` is required. For an organization-scoped view, the data is org-wide (scoped only to the caller's organization) and `customerId` is ignored. The scope is enforced by the database — it cannot be widened by the stored SQL. If the view declares filters, pass per-request values as `filter_<name>` query parameters (e.g. `filter_region=eu`); undeclared names or disallowed values are rejected with 400. Filters narrow data within the scope — never widen it.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().getCustomViewData(
    "displayId",
    GetCustomViewDataRequest
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

**displayId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Customer to scope the data to (dev/preview only; the embed derives this from the verified token). Required for customer-scoped views; ignored for organization-scoped views (their data is org-wide).
    
</dd>
</dl>

<dl>
<dd>

**periodKind:** `Optional<GetCustomViewDataRequestPeriodKind>` — Override the view's default date range for this request only. 'relative' = rolling window (set periodUnit + periodAmount); 'absolute' = fixed range (set periodStart + periodEnd).
    
</dd>
</dl>

<dl>
<dd>

**periodUnit:** `Optional<GetCustomViewDataRequestPeriodUnit>` — relative override only: unit of the rolling window.
    
</dd>
</dl>

<dl>
<dd>

**periodAmount:** `Optional<Integer>` — relative override only: how many units back from today.
    
</dd>
</dl>

<dl>
<dd>

**periodStart:** `Optional<String>` — absolute override only: inclusive start date (YYYY-MM-DD).
    
</dd>
</dl>

<dl>
<dd>

**periodEnd:** `Optional<String>` — absolute override only: inclusive end date (YYYY-MM-DD).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customViewsExperimental.getCustomViewEmbedToken(displayId) -> CustomViewEmbedTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

Mints a short-lived, customer-scoped token for embedding a published custom view. Call this from your server with your API key, then pass the returned token to the embed SDK. Organization-scoped views cannot be embedded per-customer — this returns a 400 (`ORG_SCOPED_VIEW_NOT_EMBEDDABLE`) for one.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customViewsExperimental().getCustomViewEmbedToken(
    "displayId",
    GetCustomViewEmbedTokenRequest
        .builder()
        .customerId("customerId")
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

**displayId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `String` — The customer to scope the view to: external id, Paid display id (cus_…), or internal id.
    
</dd>
</dl>

<dl>
<dd>

**ttlSeconds:** `Optional<Integer>` — Token lifetime in seconds (capped at 3600).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ValueModels
<details><summary><code>client.valueModels.getCurrentValueModel() -> ValueModelDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the current (latest active) value model for the organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueModels().getCurrentValueModel();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueModels.updateValueModel(request) -> ValueModelDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Uploads a new value model version. Validates the content, creates a new version, archives the previous active version, syncs to ClickHouse, and triggers a backfill of all historical signals.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueModels().updateValueModel(
    ValueModelUploadRequest
        .builder()
        .content(
            ValueModelContent
                .builder()
                .currency("currency")
                .valueTypes(
                    new ArrayList<ValueModelContentValueTypesItem>(
                        Arrays.asList(
                            ValueModelContentValueTypesItem
                                .builder()
                                .slug("slug")
                                .name("name")
                                .calculationTimeline(
                                    new ArrayList<ValueModelContentValueTypesItemCalculationTimelineItem>(
                                        Arrays.asList(
                                            ValueModelContentValueTypesItemCalculationTimelineItem
                                                .builder()
                                                .effectiveFrom(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                                                .calculation(
                                                    ValueModelContentValueTypesItemCalculationTimelineItemCalculation
                                                        .builder()
                                                        .unit(
                                                            ValueModelContentValueTypesItemCalculationTimelineItemCalculationUnit.ofValueModelContentValueTypesItemCalculationTimelineItemCalculationUnitZero(
                                                                ValueModelContentValueTypesItemCalculationTimelineItemCalculationUnitZero
                                                                    .builder()
                                                                    .type(ValueModelContentValueTypesItemCalculationTimelineItemCalculationUnitZeroType.MONETARY)
                                                                    .build()
                                                            )
                                                        )
                                                        .formulaIds(
                                                            new ArrayList<String>(
                                                                Arrays.asList("formulaIds")
                                                            )
                                                        )
                                                        .signalEventNames(
                                                            new ArrayList<String>(
                                                                Arrays.asList("signalEventNames")
                                                            )
                                                        )
                                                        .segmentTableIds(
                                                            new ArrayList<String>(
                                                                Arrays.asList("segmentTableIds")
                                                            )
                                                        )
                                                        .overrideIds(
                                                            new ArrayList<String>(
                                                                Arrays.asList("overrideIds")
                                                            )
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                    )
                                )
                                .build()
                        )
                    )
                )
                .formulas(
                    new ArrayList<ValueModelContentFormulasItem>(
                        Arrays.asList(
                            ValueModelContentFormulasItem
                                .builder()
                                .id("id")
                                .valueTypeSlug("valueTypeSlug")
                                .label("label")
                                .variables(
                                    new ArrayList<ValueModelContentFormulasItemVariablesItem>(
                                        Arrays.asList(
                                            ValueModelContentFormulasItemVariablesItem
                                                .builder()
                                                .id("id")
                                                .label("label")
                                                .build()
                                        )
                                    )
                                )
                                .expression("expression")
                                .build()
                        )
                    )
                )
                .signals(
                    new ArrayList<ValueModelContentSignalsItem>(
                        Arrays.asList(
                            ValueModelContentSignalsItem
                                .builder()
                                .eventName("eventName")
                                .label("label")
                                .build()
                        )
                    )
                )
                .build()
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

**content:** `ValueModelContent` 
    
</dd>
</dl>

<dl>
<dd>

**effectiveFrom:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**effectiveTo:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueModels.listValueModelVersions() -> ValueModelVersionListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns all value model versions sorted by version descending. Does not include the full content.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueModels().listValueModelVersions(
    ListValueModelVersionsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueModels.getValueModelVersion(version) -> ValueModelDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a specific historical value model version by version number, including full content.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueModels().getValueModelVersion(
    1,
    GetValueModelVersionRequest
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

**version:** `Integer` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueModels.refreshValueModelBackfill(request) -> BackfillResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Manually triggers a recalculation of all ClickHouse rows against the current value model.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueModels().refreshValueModelBackfill(
    RefreshValueModelBackfillRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ValueMetrics
<details><summary><code>client.valueMetrics.listValueMetrics() -> ValueMetricListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the value metrics in the current value model, without their formulas. Archived metrics are hidden unless includeArchived is true.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueMetrics().listValueMetrics(
    ListValueMetricsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**includeArchived:** `Optional<Boolean>` — Whether to include archived metrics in the response. Defaults to false.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueMetrics.createValueMetric(request) -> ValueMetricWriteAck</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Adds one value metric — its unit, formula, signal binding and optional monetary conversion — to the value model. The signal must already exist: an event name your organization has sent, or one referenced by usage pricing on an active product. Publishes a new value model version and recalculates delivered value for historical signals.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueMetrics().createValueMetric(
    CreateValueMetricRequest
        .builder()
        .name("Time saved")
        .unit(
            ValueMetricUnit
                .builder()
                .type(ValueMetricUnitType.MONETARY)
                .build()
        )
        .formula(
            ValueMetricFormula
                .builder()
                .expression("minutes_saved / 60")
                .variables(
                    new ArrayList<ValueMetricFormulaVariable>(
                        Arrays.asList(
                            ValueMetricFormulaVariable
                                .builder()
                                .id("id")
                                .label("label")
                                .build()
                        )
                    )
                )
                .build()
        )
        .signal(
            ValueMetricSignalBinding
                .builder()
                .eventName("ticket_resolved")
                .build()
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

**name:** `String` — Customer-facing metric name.
    
</dd>
</dl>

<dl>
<dd>

**slug:** `Optional<String>` — Stable identifier. Derived from the name when omitted.
    
</dd>
</dl>

<dl>
<dd>

**unit:** `ValueMetricUnit` 
    
</dd>
</dl>

<dl>
<dd>

**monetaryConversion:** `Optional<ValueMetricMonetaryConversion>` 
    
</dd>
</dl>

<dl>
<dd>

**formula:** `ValueMetricFormula` 
    
</dd>
</dl>

<dl>
<dd>

**signal:** `ValueMetricSignalBinding` 
    
</dd>
</dl>

<dl>
<dd>

**category:** `Optional<CreateValueMetricRequestCategory>` — Classification: hve = human value equivalent, time = time saved, cost = cost savings, revenue = revenue generated, risk = risk avoided.
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — Short customer-facing copy shown on value receipts.
    
</dd>
</dl>

<dl>
<dd>

**longDescription:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**sources:** `Optional<List<CreateValueMetricRequestSourcesItem>>` — Up to 3 customer-facing citations backing this metric.
    
</dd>
</dl>

<dl>
<dd>

**expectedActiveVersion:** `Optional<Integer>` — Optimistic concurrency guard. When supplied and it does not match the live active version, the request fails with 409 instead of overwriting a concurrent change.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueMetrics.getValueMetric(slug) -> ValueMetricDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns one value metric with its formula, signal binding and monetary conversion joined together. Call getCurrentValueModel if you need the active version number to guard a follow-up write.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueMetrics().getValueMetric(
    "slug",
    GetValueMetricRequest
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

**slug:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueMetrics.archiveValueMetric(slug) -> ValueMetricWriteAck</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Marks a value metric archived so it stops appearing in listValueMetrics. Its formula and signal bindings are deliberately kept, so historical delivered value and sealed value receipts still resolve — which also means an archived metric's signals continue to be ingested and can still surface on value receipts. Removing it from receipts entirely requires deleting its signal bindings. Restore it with updateValueMetric and archivedAt null.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueMetrics().archiveValueMetric(
    "slug",
    ArchiveValueMetricRequest
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

**slug:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**expectedActiveVersion:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.valueMetrics.updateValueMetric(slug, request) -> ValueMetricWriteAck</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Changes one value metric. Omitted fields are left alone. You can change its name, category, unit, customer-facing copy, sources, monetary rate, archive state, and the value, label or display format of any variable its formula declares. The formula expression and the signal it is bound to cannot be changed — recreate the metric, or use the whole value-model upload. Publishes a new value model version.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.valueMetrics().updateValueMetric(
    "slug",
    UpdateValueMetricRequest
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

**slug:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**unit:** `Optional<ValueMetricUnit>` 
    
</dd>
</dl>

<dl>
<dd>

**monetaryConversion:** `Optional<ValueMetricMonetaryConversion>` 
    
</dd>
</dl>

<dl>
<dd>

**variables:** `Optional<Map<String, ValueMetricVariableEdit>>` — Per-variable edits, keyed by the variable id the formula declares. Merged: a variable you do not name is untouched. Naming one the formula does not declare is an error rather than a no-op.
    
</dd>
</dl>

<dl>
<dd>

**archivedAt:** `Optional<OffsetDateTime>` — Set null to restore an archived metric.
    
</dd>
</dl>

<dl>
<dd>

**category:** `Optional<UpdateValueMetricRequestCategory>` — Classification: hve = human value equivalent, time = time saved, cost = cost savings, revenue = revenue generated, risk = risk avoided.
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — Short customer-facing copy shown on value receipts.
    
</dd>
</dl>

<dl>
<dd>

**longDescription:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**sources:** `Optional<List<UpdateValueMetricRequestSourcesItem>>` — Up to 3 customer-facing citations backing this metric.
    
</dd>
</dl>

<dl>
<dd>

**expectedActiveVersion:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## CustomerGroups
<details><summary><code>client.customerGroups.listCustomerGroups() -> CustomerGroupListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List all customer groups for the organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().listCustomerGroups(
    ListCustomerGroupsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customerGroups.createCustomerGroup(request) -> CustomerGroupDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create a new customer group. Names must be unique per org.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().createCustomerGroup(
    CreateCustomerGroupRequest
        .builder()
        .name("name")
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

**description:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customerGroups.getCustomerGroup(id) -> CustomerGroupDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns group details including member list (capped at 500).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().getCustomerGroup(
    "id",
    GetCustomerGroupRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customerGroups.deleteCustomerGroup(id, request) -> CustomerGroupDeleteResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes the group and unbinds all members. Unbound customers fall back to the base value model config.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().deleteCustomerGroup(
    "id",
    DeleteCustomerGroupRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customerGroups.updateCustomerGroup(id, request) -> CustomerGroupDetail</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a customer group's name or description.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().updateCustomerGroup(
    "id",
    UpdateCustomerGroupRequest
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customerGroups.createCustomerGroupMembers(id, request) -> AddMembersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Additive. Adds customers to the group without removing existing members.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().createCustomerGroupMembers(
    "id",
    CreateCustomerGroupMembersRequest
        .builder()
        .body(
            MemberRequest
                .builder()
                .customerIds(
                    new ArrayList<String>(
                        Arrays.asList("customerIds")
                    )
                )
                .build()
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `MemberRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customerGroups.updateCustomerGroupMembers(id, request) -> SetMembersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Reconcile membership. The provided list is the complete desired membership. Customers not in the list are removed. Customers in the list but not currently in the group are added.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().updateCustomerGroupMembers(
    "id",
    UpdateCustomerGroupMembersRequest
        .builder()
        .body(
            MemberRequest
                .builder()
                .customerIds(
                    new ArrayList<String>(
                        Arrays.asList("customerIds")
                    )
                )
                .build()
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `MemberRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customerGroups.deleteCustomerGroupMembers(id, request) -> RemoveMembersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Removes specific customers from the group.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customerGroups().deleteCustomerGroupMembers(
    "id",
    DeleteCustomerGroupMembersRequest
        .builder()
        .body(
            MemberRequest
                .builder()
                .customerIds(
                    new ArrayList<String>(
                        Arrays.asList("customerIds")
                    )
                )
                .build()
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

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `MemberRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## PaymentMethods
<details><summary><code>client.paymentMethods.listPaymentMethods() -> PaymentMethodListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the payment methods saved for a customer
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentMethods().listPaymentMethods(
    ListPaymentMethodsRequest
        .builder()
        .customerId("cus_1234abcd")
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Filter by Paid customer ID.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Filter by your external customer ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentMethods.createPaymentMethod(request) -> PaymentMethodSetup</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Starts attaching a payment method to a customer by exchanging a client-side confirmation token for a setup intent. Complete any additional authentication client-side using the returned client secret.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentMethods().createPaymentMethod(
    CreatePaymentMethodRequest
        .builder()
        .confirmationToken("ctoken_1NXWPnLkdIwHu7ix")
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

**customerId:** `Optional<String>` — Paid customer ID to attach the payment method to.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Your external customer ID to attach the payment method to.
    
</dd>
</dl>

<dl>
<dd>

**confirmationToken:** `String` — Confirmation token generated client-side by the payment processor's elements (e.g. a Stripe ConfirmationToken ID).
    
</dd>
</dl>

<dl>
<dd>

**returnUrl:** `Optional<String>` — URL the customer is redirected to after completing any additional authentication step (e.g. 3-D Secure).
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, String>>` — Key-value metadata stored on the setup intent.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentMethods.getPaymentMethod(id) -> PaymentMethod</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a payment method by its ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentMethods().getPaymentMethod(
    "id",
    GetPaymentMethodRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentMethods.deletePaymentMethod(id) -> EmptyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Detaches a payment method from the customer and removes it from the payment processor
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentMethods().deletePaymentMethod(
    "id",
    DeletePaymentMethodRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentMethods.updateDefaultPaymentMethod(id, request) -> PaymentMethod</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Makes this payment method the customer's default for future charges
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentMethods().updateDefaultPaymentMethod(
    "id",
    UpdateDefaultPaymentMethodRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Payments
<details><summary><code>client.payments.listPayments() -> PaymentListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists payments for your organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.payments().listPayments(
    ListPaymentsRequest
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Filter by Paid customer ID.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Filter by your external customer ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<ListPaymentsRequestStatus>` — Filter by payment status.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.payments.createPayment(request) -> Payment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Records a payment received from a customer, e.g. a bank transfer or check collected outside Paid. Allocate it to invoice lines with the payment allocations endpoints.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.payments().createPayment(
    CreatePaymentRequest
        .builder()
        .amount(15000)
        .currency("USD")
        .paymentType(PaymentType.CREDIT_CARD)
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

**customerId:** `Optional<String>` — Paid customer ID the payment belongs to.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Your external customer ID the payment belongs to.
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Integer` — Payment amount in cents (minor currency units).
    
</dd>
</dl>

<dl>
<dd>

**currency:** `String` — Three-letter ISO currency code.
    
</dd>
</dl>

<dl>
<dd>

**paymentDate:** `Optional<OffsetDateTime>` — When the payment was made (ISO 8601). Defaults to the current time.
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `PaymentType` 
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<PaymentCreateStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` — Key-value metadata stored on the payment.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.payments.getPayment(id) -> Payment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a payment by its ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.payments().getPayment(
    "id",
    GetPaymentRequest
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

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## PaymentAllocations
<details><summary><code>client.paymentAllocations.listPaymentAllocations() -> PaymentAllocationListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists payment allocations for a payment or an invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentAllocations().listPaymentAllocations(
    ListPaymentAllocationsRequest
        .builder()
        .paymentId("pay_1234abcd")
        .invoiceId("inv_1234abcd")
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

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**paymentId:** `Optional<String>` — Filter by the payment the amounts were allocated from.
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter by the invoice the allocated lines belong to.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentAllocations.createPaymentAllocation(request) -> PaymentAllocationCreateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Allocates a payment across one or more invoice lines. When an invoice becomes fully paid, its credit entitlements are processed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentAllocations().createPaymentAllocation(
    CreatePaymentAllocationRequest
        .builder()
        .paymentId("pay_1234abcd")
        .allocations(
            new ArrayList<PaymentAllocationInput>(
                Arrays.asList(
                    PaymentAllocationInput
                        .builder()
                        .invoiceLineId("invoiceLineId")
                        .amount(15000)
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

**paymentId:** `String` — The payment to allocate from.
    
</dd>
</dl>

<dl>
<dd>

**allocations:** `List<PaymentAllocationInput>` — Invoice lines to allocate the payment to.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Amendments
<details><summary><code>client.amendments.getOrderAmendmentOptions(orderId) -> AmendmentOptions</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns which amendments the order admits right now: per-attribute intents and treatment axes with choosable options, defaults, and unavailability reasons, plus the order version, currency, and effective date an amendment request needs.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.amendments().getOrderAmendmentOptions(
    "orderId",
    GetOrderAmendmentOptionsRequest
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

**orderId:** `String` — Display id of the order (for example `ord_5rLZXDFSHNw`). Line and attribute ids in amendment bodies are UUIDs from the options response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.amendments.previewOrderAmendment(orderId, request) -> AmendmentPlan</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Compiles amendment intents into a plan (operations, money effects, credit effects, state diff) without executing. The returned planHash can be passed to the execute endpoint for two-phase, drift-guarded execution.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.amendments().previewOrderAmendment(
    "orderId",
    UnifiedAmendmentPreviewRequest
        .builder()
        .orderVersion(1)
        .intents(
            new ArrayList<UnifiedAmendmentIntent>(
                Arrays.asList(
                    UnifiedAmendmentIntent.updateQuantity(
                        UpdateQuantityIntent
                            .builder()
                            .orderLineAttributeId("orderLineAttributeId")
                            .newQuantity(1)
                            .build()
                    )
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

**orderId:** `String` — Display id of the order (for example `ord_5rLZXDFSHNw`). Line and attribute ids in amendment bodies are UUIDs from the options response.
    
</dd>
</dl>

<dl>
<dd>

**orderVersion:** `Integer` — Must match `orderVersion` from the options response. Returns 409 if the order has been amended since.
    
</dd>
</dl>

<dl>
<dd>

**intents:** `List<UnifiedAmendmentIntent>` — At least one intent, discriminated by type.
    
</dd>
</dl>

<dl>
<dd>

**defaultTreatment:** `Optional<UnifiedAmendmentPreviewRequestDefaultTreatment>` — Recurring charges pick next-cycle vs settle-now. Usage price changes pick new usage only vs the whole current period.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.amendments.executeOrderAmendment(orderId, request) -> UnifiedAmendmentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Executes amendment intents against an order. One-shot by default; pass the previewed planHash to require the recomputed plan to match (409 PLAN_CONFLICT on drift).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.amendments().executeOrderAmendment(
    "orderId",
    UnifiedAmendmentExecuteRequest
        .builder()
        .orderVersion(1)
        .intents(
            new ArrayList<UnifiedAmendmentIntent>(
                Arrays.asList(
                    UnifiedAmendmentIntent.updateQuantity(
                        UpdateQuantityIntent
                            .builder()
                            .orderLineAttributeId("orderLineAttributeId")
                            .newQuantity(1)
                            .build()
                    )
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

**orderId:** `String` — Display id of the order (for example `ord_5rLZXDFSHNw`). Line and attribute ids in amendment bodies are UUIDs from the options response.
    
</dd>
</dl>

<dl>
<dd>

**orderVersion:** `Integer` — Must match `orderVersion` from the options response. Returns 409 if the order has been amended since.
    
</dd>
</dl>

<dl>
<dd>

**intents:** `List<UnifiedAmendmentIntent>` — At least one intent, discriminated by type.
    
</dd>
</dl>

<dl>
<dd>

**defaultTreatment:** `Optional<UnifiedAmendmentExecuteRequestDefaultTreatment>` — Recurring charges pick next-cycle vs settle-now. Usage price changes pick new usage only vs the whole current period.
    
</dd>
</dl>

<dl>
<dd>

**planHash:** `Optional<String>` — From preview. When set, execute recomputes the plan and returns 409 `PLAN_CONFLICT` if billing state has drifted. Omit only for one-shot execute.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AnalyticsExperimental
<details><summary><code>client.analyticsExperimental.executeExperimentalAnalyticsQuery(request) -> AnalyticsQueryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This experimental path is deprecated and is not supported for new integrations. Use `POST /api/v2/analytics/query` instead; the old path remains available for existing integrations.

Runs a single ClickHouse SELECT (or WITH … SELECT) against your organization's analytics views. Before writing a query, call `getAnalyticsSchema` (GET /schema) for the available views and columns, and `getSignalsMetadata` (GET /signals/metadata) for the JSON paths inside `fact_signal.data`. Results are automatically scoped to your organization — no org filter is needed or possible. Only SELECT/WITH statements are accepted.

Conventions: monetary amounts are minor units (cents — divide by 100 for the major unit); most are integers, but `fact_cost.cost_amount` is fractional cents (Decimal) since a single AI call usually costs less than a cent; 64-bit integers (counts, ids, amounts) are returned as JSON strings to preserve precision, so parse them client-side; Decimal columns (fractional cents, and credit amounts, which are counts of credits rather than cents and are never divided by 100) come back as JSON numbers instead, so a value beyond 2^53 is already rounded — select toString(col) when you need its exact digits. Query signal payloads via JSON paths, e.g. `SELECT data.country::String AS country, count() FROM fact_signal GROUP BY country`.

Limits: 30 seconds of execution time and 10,000 result rows (truncation is flagged via `meta.truncated`). Prefer aggregates and a `created_at` date filter on large tables — this endpoint is for interactive analytics, not bulk export.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.analyticsExperimental().executeExperimentalAnalyticsQuery(
    AnalyticsQueryRequest
        .builder()
        .query("SELECT signal_name, count() AS signals FROM fact_signal WHERE created_at > now() - INTERVAL 30 DAY GROUP BY signal_name ORDER BY signals DESC")
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

**request:** `AnalyticsQueryRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.analyticsExperimental.getExperimentalAnalyticsSchema() -> AnalyticsSchemaResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This experimental path is deprecated and is not supported for new integrations. Use `GET /api/v2/analytics/schema` instead; the old path remains available for existing integrations.

Returns the analytics views available to POST /query, with column names, ClickHouse types, and descriptions. Dimensions (`dim_*`) describe entities; facts (`fact_*`) are event/transaction tables that join to dimensions via the `*_id` columns described in each comment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.analyticsExperimental().getExperimentalAnalyticsSchema();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.analyticsExperimental.getExperimentalSignalsMetadata() -> SignalsMetadataResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This experimental path is deprecated and is not supported for new integrations. Use `GET /api/v2/analytics/signals/metadata` instead; the old path remains available for existing integrations.

Lists the JSON paths (and their observed types) present in the `data` payload of your signals within a time window (default: last 30 days), grouped by signal name. Use the returned paths in queries against `fact_signal`, e.g. `WHERE data.<path>::String = '...'`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.analyticsExperimental().getExperimentalSignalsMetadata(
    GetExperimentalSignalsMetadataRequest
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

**signalName:** `Optional<String>` — Restrict discovery to a single signal name.
    
</dd>
</dl>

<dl>
<dd>

**fromDate:** `Optional<OffsetDateTime>` — Start of the discovery window. Defaults to 30 days ago.
    
</dd>
</dl>

<dl>
<dd>

**toDate:** `Optional<OffsetDateTime>` — End of the discovery window. Defaults to now.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

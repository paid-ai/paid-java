# Reference
## products
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

## plans
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

## customers
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

Creates a new customer for the organization. `externalId` shares one set of ids with customer unit ids and aliases, unique across the organization and ignoring letter case: an external id that another customer already holds as a unit id or alias, or as its external id in another case, is refused with `409 EXTERNAL_ID_IN_USE`. The same id in the same case is `400 DUPLICATE_EXTERNAL_ID`, as before.
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

Create an alternate external identifier for a customer by Paid display ID. The alias shares one set of ids with customer external ids and unit ids, unique within the organization and ignoring letter case: an alias that another customer already holds as its external id, a unit id or an alias is refused with `409 EXTERNAL_ID_IN_USE` (an exact match keeps its older code, `ALIAS_CONFLICTS_WITH_CUSTOMER_EXTERNAL_ID` or `CUSTOMER_ALIAS_ALREADY_EXISTS`).
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

Update a customer by Paid display ID. Use the value returned as `customer.id`, for example `cus_abc123`. If you have your own customer ID, use `PUT /api/v2/customers/external/{externalId}`. Changing `externalId` follows the organization-wide id rule: a new id that another customer already holds as its external id, a unit id or an alias, ignoring letter case, is refused with `409 EXTERNAL_ID_IN_USE`; the same id in the same case stays `400 DUPLICATE_EXTERNAL_ID`. When the id changes, the previous id is kept as an alias of the customer, so signals that still use it keep resolving to it.
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

Delete a customer by Paid display ID. Use the value returned as `customer.id`, for example `cus_abc123`. If you have your own customer ID, use `DELETE /api/v2/customers/external/{externalId}`. A customer that still has orders, invoices, payments, contacts, child customers or other linked records is not deleted: the request returns 409 `CUSTOMER_HAS_ASSOCIATIONS` and `details` lists what is linked.
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

Create an alternate external identifier for a customer by external ID. The alias shares one set of ids with customer external ids and unit ids, unique within the organization and ignoring letter case: an alias that another customer already holds as its external id, a unit id or an alias is refused with `409 EXTERNAL_ID_IN_USE` (an exact match keeps its older code, `ALIAS_CONFLICTS_WITH_CUSTOMER_EXTERNAL_ID` or `CUSTOMER_ALIAS_ALREADY_EXISTS`).
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

Update a customer by external ID. Changing `externalId` follows the organization-wide id rule: a new id that another customer already holds as its external id, a unit id or an alias, ignoring letter case, is refused with `409 EXTERNAL_ID_IN_USE`; the same id in the same case stays `400 DUPLICATE_EXTERNAL_ID`. When the id changes, the previous id is kept as an alias of the customer, so signals that still use it keep resolving to it.
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

Delete a customer by external ID. A customer that still has orders, invoices, payments, contacts, child customers or other linked records is not deleted: the request returns 409 `CUSTOMER_HAS_ASSOCIATIONS` and `details` lists what is linked.
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
                .idempotencyKey("grant_acme_2026-06-05")
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
                .idempotencyKey("grant_acme_2026-06-05")
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

<details><summary><code>client.customers.getCustomerFundingInstructions(id) -> CustomerFundingInstructions</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the virtual bank account (Stripe funding instructions) a customer can pay by bank transfer into, by Paid display ID.
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
client.customers().getCustomerFundingInstructions(
    "cus_abc123",
    GetCustomerFundingInstructionsRequest
        .builder()
        .currency("USD")
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

**currency:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomerFundingInstructions(id, request) -> CustomerFundingInstructions</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a dedicated virtual bank account for the customer to pay invoices by bank transfer, by Paid display ID. Returns the existing account if one already exists for the currency. Requires a live-mode organization with Stripe connected and Bank Transfers enabled on the Stripe account.
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
client.customers().createCustomerFundingInstructions(
    "cus_abc123",
    CreateCustomerFundingInstructionsRequest
        .builder()
        .body(
            CustomerFundingInstructionsCreateRequest
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

**request:** `CustomerFundingInstructionsCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerFundingInstructionsByExternalId(externalId) -> CustomerFundingInstructions</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the virtual bank account (Stripe funding instructions) a customer can pay by bank transfer into, by your external ID.
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
client.customers().getCustomerFundingInstructionsByExternalId(
    "externalId",
    GetCustomerFundingInstructionsByExternalIdRequest
        .builder()
        .currency("USD")
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

**currency:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomerFundingInstructionsByExternalId(externalId, request) -> CustomerFundingInstructions</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a dedicated virtual bank account for the customer to pay invoices by bank transfer, by your external ID. Returns the existing account if one already exists for the currency. Requires a live-mode organization with Stripe connected and Bank Transfers enabled on the Stripe account.
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
client.customers().createCustomerFundingInstructionsByExternalId(
    "externalId",
    CreateCustomerFundingInstructionsByExternalIdRequest
        .builder()
        .body(
            CustomerFundingInstructionsCreateRequest
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

**request:** `CustomerFundingInstructionsCreateRequest` 
    
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

Lists the customer's units as a flat list, newest last; assemble the tree from `parentExternalId` (`null` on the root unit, `isRoot: true`). Deleted units are hidden unless `status=DELETED` is given, drafts unless `status=DRAFT`. Filter by `externalType`, or by `parentExternalId` for one level of the tree. Addresses the customer by your external customer id.
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

**status:** `Optional<ListCustomerUnitsByExternalIdRequestStatus>` — Filter by status (default ACTIVE; drafts are listed only with DRAFT).
    
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

Creates a unit for this customer. `externalId` is your own key for it: required, immutable, and unique within the organization (no other customer's unit id, external id or alias may be the same, ignoring letter case, and a key another customer's signals named while that customer had no unit with it is kept for that customer: `409 EXTERNAL_ID_IN_USE`); every unit route addresses the unit by it, and `name` defaults to it. Omit `parentExternalId` to create the customer's root unit (its first unit; `409 ROOT_EXISTS` if it already has one — a customer created with an external id usable as a unit key already has its root, keyed by that external id, so name it as the parent instead); otherwise the parent must exist (`409 PARENT_NOT_FOUND`) and be ACTIVE. A create whose `externalId` is one of this customer's `DRAFT` units promotes the draft in place: same unit, same id, now ACTIVE with the request's name, type, metadata and parent (`parentExternalId` is required; a draft sits under the root). A signal that names a unit before it exists is accepted; with draft units enabled for your organization it creates a `DRAFT` unit under the customer's root that holds the key, and creating the unit with that key later promotes the draft; otherwise its spend attaches to the unit once you create it with that key. `409` also when the externalId is taken on this customer (`CUSTOMER_UNIT_EXISTS`) or by another customer of the organization (`EXTERNAL_ID_IN_USE`), the tree would get too deep, the customer is on seat-based billing, or a root unit is sent with `billable: false` (`ROOT_UNIT_ALWAYS_BILLABLE`). `403 FEATURE_NOT_ENABLED` for `billable: false` when non-billable units are not enabled for your organization. Addresses the customer by your external customer id.
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

Soft-deletes a unit: it stays readable with `status: DELETED` and cannot be reactivated. Spend history that references it is kept, and signals that keep naming it are still attributed to it. A `DRAFT` unit is deleted the same way: it stays readable as DELETED, its key stays reserved, and spend already keyed to it stays its own. `409` while the unit has ACTIVE or DRAFT children or a cap in force or scheduled; the root follows the same rules, and once it is deleted a new root can be created. Addresses the customer by your external customer id.
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

Renames, re-types, re-parents or annotates a unit, the root included. `externalId` cannot change. Re-parenting (`parentExternalId`) moves the unit with everything under it. Spend already recorded keeps naming the unit it landed on; caps are evaluated on the current tree, so from the move on the unit's spend in the running cap period counts toward its new ancestors' caps and no longer toward the old ones. `billable` flips the unit's own setting; moving a unit under a non-billable one makes it non-billable in effect (`effectiveBillable`). `409` for a deleted unit (`CUSTOMER_UNIT_DELETED`), a draft (`CUSTOMER_UNIT_DRAFT`), a parent that does not exist or is not ACTIVE, a move of the root (`ROOT_UNIT_IMMOVABLE`), `billable: false` on the root (`ROOT_UNIT_ALWAYS_BILLABLE`), a move under the unit's own subtree, or a tree that would get too deep. `403 FEATURE_NOT_ENABLED` for `billable: false` when non-billable units are not enabled for your organization. Addresses the customer by your external customer id.
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

<details><summary><code>client.customers.listCustomerUnitAliasesByExternalId(externalId, externalCustomerUnitId) -> CustomerAliasListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the aliases that land signals on this unit. A customer-level alias (created on the customer routes) points at the customer's root unit, so it is listed under the root. Addresses the customer by your external customer id.
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
client.customers().listCustomerUnitAliasesByExternalId(
    "customer_123",
    "team-research",
    ListCustomerUnitAliasesByExternalIdRequest
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

<details><summary><code>client.customers.createCustomerUnitAliasByExternalId(externalId, externalCustomerUnitId, request) -> CustomerAlias</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an alias that lands signals on this unit: a signal whose `externalCustomerId` is the alias resolves to this customer and, when it names no `customerUnit`, to this unit. The alias shares one set of ids with customer external ids and unit ids, unique within the organization and ignoring letter case: an alias another customer holds is refused with `409 EXTERNAL_ID_IN_USE`. Addresses the customer by your external customer id.
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
client.customers().createCustomerUnitAliasByExternalId(
    "customer_123",
    "team-research",
    CreateCustomerUnitAliasByExternalIdRequest
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

**request:** `CustomerAliasCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.deleteCustomerUnitAliasByExternalId(externalId, externalCustomerUnitId, alias) -> DeleteCustomerUnitAliasByExternalIdResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an alias of this unit. Signals still sent with it then resolve to nothing again. Addresses the customer by your external customer id.
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
client.customers().deleteCustomerUnitAliasByExternalId(
    "customer_123",
    "team-research",
    "tenant-7-sandbox",
    DeleteCustomerUnitAliasByExternalIdRequest
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

<dl>
<dd>

**alias:** `String` — The alias, as created.
    
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

Lists the customer's units as a flat list, newest last; assemble the tree from `parentExternalId` (`null` on the root unit, `isRoot: true`). Deleted units are hidden unless `status=DELETED` is given, drafts unless `status=DRAFT`. Filter by `externalType`, or by `parentExternalId` for one level of the tree. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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

**status:** `Optional<ListCustomerUnitsRequestStatus>` — Filter by status (default ACTIVE; drafts are listed only with DRAFT).
    
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

Creates a unit for this customer. `externalId` is your own key for it: required, immutable, and unique within the organization (no other customer's unit id, external id or alias may be the same, ignoring letter case, and a key another customer's signals named while that customer had no unit with it is kept for that customer: `409 EXTERNAL_ID_IN_USE`); every unit route addresses the unit by it, and `name` defaults to it. Omit `parentExternalId` to create the customer's root unit (its first unit; `409 ROOT_EXISTS` if it already has one — a customer created with an external id usable as a unit key already has its root, keyed by that external id, so name it as the parent instead); otherwise the parent must exist (`409 PARENT_NOT_FOUND`) and be ACTIVE. A create whose `externalId` is one of this customer's `DRAFT` units promotes the draft in place: same unit, same id, now ACTIVE with the request's name, type, metadata and parent (`parentExternalId` is required; a draft sits under the root). A signal that names a unit before it exists is accepted; with draft units enabled for your organization it creates a `DRAFT` unit under the customer's root that holds the key, and creating the unit with that key later promotes the draft; otherwise its spend attaches to the unit once you create it with that key. `409` also when the externalId is taken on this customer (`CUSTOMER_UNIT_EXISTS`) or by another customer of the organization (`EXTERNAL_ID_IN_USE`), the tree would get too deep, the customer is on seat-based billing, or a root unit is sent with `billable: false` (`ROOT_UNIT_ALWAYS_BILLABLE`). `403 FEATURE_NOT_ENABLED` for `billable: false` when non-billable units are not enabled for your organization. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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

Soft-deletes a unit: it stays readable with `status: DELETED` and cannot be reactivated. Spend history that references it is kept, and signals that keep naming it are still attributed to it. A `DRAFT` unit is deleted the same way: it stays readable as DELETED, its key stays reserved, and spend already keyed to it stays its own. `409` while the unit has ACTIVE or DRAFT children or a cap in force or scheduled; the root follows the same rules, and once it is deleted a new root can be created. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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

Renames, re-types, re-parents or annotates a unit, the root included. `externalId` cannot change. Re-parenting (`parentExternalId`) moves the unit with everything under it. Spend already recorded keeps naming the unit it landed on; caps are evaluated on the current tree, so from the move on the unit's spend in the running cap period counts toward its new ancestors' caps and no longer toward the old ones. `billable` flips the unit's own setting; moving a unit under a non-billable one makes it non-billable in effect (`effectiveBillable`). `409` for a deleted unit (`CUSTOMER_UNIT_DELETED`), a draft (`CUSTOMER_UNIT_DRAFT`), a parent that does not exist or is not ACTIVE, a move of the root (`ROOT_UNIT_IMMOVABLE`), `billable: false` on the root (`ROOT_UNIT_ALWAYS_BILLABLE`), a move under the unit's own subtree, or a tree that would get too deep. `403 FEATURE_NOT_ENABLED` for `billable: false` when non-billable units are not enabled for your organization. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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

<details><summary><code>client.customers.listCustomerUnitAliases(id, externalCustomerUnitId) -> CustomerAliasListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the aliases that land signals on this unit. A customer-level alias (created on the customer routes) points at the customer's root unit, so it is listed under the root. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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
client.customers().listCustomerUnitAliases(
    "cus_abc123",
    "team-research",
    ListCustomerUnitAliasesRequest
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

<details><summary><code>client.customers.createCustomerUnitAlias(id, externalCustomerUnitId, request) -> CustomerAlias</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an alias that lands signals on this unit: a signal whose `externalCustomerId` is the alias resolves to this customer and, when it names no `customerUnit`, to this unit. The alias shares one set of ids with customer external ids and unit ids, unique within the organization and ignoring letter case: an alias another customer holds is refused with `409 EXTERNAL_ID_IN_USE`. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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
client.customers().createCustomerUnitAlias(
    "cus_abc123",
    "team-research",
    CreateCustomerUnitAliasRequest
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

**externalCustomerUnitId:** `String` — Your own id for the unit (its `externalId`), unique within this customer.
    
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

<details><summary><code>client.customers.deleteCustomerUnitAlias(id, externalCustomerUnitId, alias) -> DeleteCustomerUnitAliasResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an alias of this unit. Signals still sent with it then resolve to nothing again. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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
client.customers().deleteCustomerUnitAlias(
    "cus_abc123",
    "team-research",
    "tenant-7-sandbox",
    DeleteCustomerUnitAliasRequest
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

<dl>
<dd>

**alias:** `String` — The alias, as created.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.getCustomerUnitByKey(externalCustomerUnitId) -> CustomerUnitByKey</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a unit by its key without naming its customer. The answer carries the customer's ids (`customerId`, `customerExternalId`) so the customer routes are one hop away, but, like the create on this path, not Paid's unit id: a caller of these routes names units by key. The key is looked up across the organization ignoring letter case. When more than one unit carries it in another letter case (legacy duplicates across customers, or case variants on one customer), the exact spelling decides; when that does not single one out either, the answer is `409 CUSTOMER_UNIT_AMBIGUOUS`: use the customer's unit routes, where the key is exact.
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
client.customers().getCustomerUnitByKey(
    "team-research",
    GetCustomerUnitByKeyRequest
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

**externalCustomerUnitId:** `String` — Your id of the unit (its `externalId`), unique within the organization ignoring letter case.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerUnitAliasesByKey(externalCustomerUnitId) -> CustomerAliasListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists the aliases that land signals on this unit, without naming its customer. The key is looked up across the organization ignoring letter case. When more than one unit carries it in another letter case (legacy duplicates across customers, or case variants on one customer), the exact spelling decides; when that does not single one out either, the answer is `409 CUSTOMER_UNIT_AMBIGUOUS`: use the customer's unit routes, where the key is exact.
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
client.customers().listCustomerUnitAliasesByKey(
    "team-research",
    ListCustomerUnitAliasesByKeyRequest
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

**externalCustomerUnitId:** `String` — Your id of the unit (its `externalId`), unique within the organization ignoring letter case.
    
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

<details><summary><code>client.customers.createCustomerUnitAliasByKey(externalCustomerUnitId, request) -> CustomerAlias</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an alias that lands signals on this unit, without naming its customer: a signal whose `externalCustomerId` is the alias resolves to the unit's customer and is attributed to this unit. The alias must be unique within the organization ignoring letter case (`409 EXTERNAL_ID_IN_USE`). The key is looked up across the organization ignoring letter case. When more than one unit carries it in another letter case (legacy duplicates across customers, or case variants on one customer), the exact spelling decides; when that does not single one out either, the answer is `409 CUSTOMER_UNIT_AMBIGUOUS`: use the customer's unit routes, where the key is exact.
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
client.customers().createCustomerUnitAliasByKey(
    "team-research",
    CreateCustomerUnitAliasByKeyRequest
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

**externalCustomerUnitId:** `String` — Your id of the unit (its `externalId`), unique within the organization ignoring letter case.
    
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

<details><summary><code>client.customers.deleteCustomerUnitAliasByKey(externalCustomerUnitId, alias) -> DeleteCustomerUnitAliasByKeyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an alias of this unit, without naming its customer. Signals still sent with it then resolve to nothing again. The key is looked up across the organization ignoring letter case. When more than one unit carries it in another letter case (legacy duplicates across customers, or case variants on one customer), the exact spelling decides; when that does not single one out either, the answer is `409 CUSTOMER_UNIT_AMBIGUOUS`: use the customer's unit routes, where the key is exact.
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
client.customers().deleteCustomerUnitAliasByKey(
    "team-research",
    "tenant-7",
    DeleteCustomerUnitAliasByKeyRequest
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

**externalCustomerUnitId:** `String` — Your id of the unit (its `externalId`), unique within the organization ignoring letter case.
    
</dd>
</dl>

<dl>
<dd>

**alias:** `String` — The alias, as created.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.createCustomerUnitUnderParent(request) -> CustomerUnitCreatedUnderParent</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a unit by naming its parent alone; the customer is whoever the parent belongs to, so a caller that only knows its own ids never needs the customer routes. `parentExternalId` is looked up across the organization, ignoring letter case, among unit ids, customer external ids and aliases: a unit becomes the parent; a customer (by external id or alias) stands for the top of its tree, so the new unit goes under the root unit, or becomes the root when the customer has none. The parent is only ever named by your id, never by a Paid id, so a customer with no external id takes its units through the customer's unit routes. The answer carries the unit's `externalId` and its customer's ids, not Paid's unit id. `externalId` follows the same rules as on the customer-scoped create: required, immutable, unique within the organization ignoring letter case. `409 PARENT_NOT_FOUND` when nothing matches, `PARENT_NOT_ACTIVE` for a deleted or draft parent, `PARENT_AMBIGUOUS` when legacy rows let the id name more than one customer (use that customer's unit routes), `PARENT_CHANGED` when the reference pointed elsewhere by the time the create ran (send it again), and otherwise the customer-scoped create's 409s (`CUSTOMER_UNIT_EXISTS`, `EXTERNAL_ID_IN_USE`, `DEPTH_EXCEEDED`, `SEAT_BILLING`, and `ROOT_UNIT_ALWAYS_BILLABLE` for `billable: false` on a unit that would become the root). `403 FEATURE_NOT_ENABLED` for `billable: false` when non-billable units are not enabled for your organization.
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
client.customers().createCustomerUnitUnderParent(
    CustomerUnitCreateUnderParent
        .builder()
        .externalId("team-research")
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

**externalId:** `String` — Your own id for the unit: required, immutable, at most 255 characters, and unique within the organization: no other customer's unit id, external id or alias may be the same, ignoring letter case. Every unit route addresses the unit by it (percent-encode it in the path), and so do signals (`customerUnit.externalCustomerUnitId`). Cannot be `.` or `..`.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Display name (defaults to the external ID).
    
</dd>
</dl>

<dl>
<dd>

**externalType:** `Optional<String>` — Your structural vocabulary for the unit (`department`, `tenant`, `team`, ...). Free text; filterable; Paid never branches on it.
    
</dd>
</dl>

<dl>
<dd>

**parentExternalId:** `String` — Your id of the parent, looked up across the organization ignoring letter case: a unit id makes the new unit its child; a customer external id or alias names the customer, so the new unit goes under that customer's root unit, or becomes the root when the customer has none. Required: a parent is only ever named by your id, never by a Paid id.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Object>>` — Freeform JSON for your own use.
    
</dd>
</dl>

<dl>
<dd>

**billable:** `Optional<Boolean>` — `false` makes the unit non-billable, together with every unit under it (a dev or QA environment, say). Defaults to `true`. The root unit is always billable (`409 ROOT_UNIT_ALWAYS_BILLABLE`): a customer that should never be billed simply has no order. Sending `false` needs non-billable units enabled for your organization (`403 FEATURE_NOT_ENABLED` otherwise). Usage on a non-billable unit is still recorded but not billed: it burns no credits, adds nothing to invoices or overage, and counts toward no cap, on a price whose usage comes from a meter (read from your events when the invoice closes) too. A meter's derived signal, and a correlation-window meter's window, follow the source event they take their unit from (the window's closing event, else its opening event): they are not billed when that event was not. Usage is still billed when it is sent with a customer API key, and on cost-plus pricing, which bills from costs that carry no unit. Only signals sent to `/api/v2/signals` that resolve to an active unit, by its key or through an alias on it, can be non-billable, and a change applies to signals received afterwards.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerApiKeysByExternalId(externalId) -> CustomerApiKeyList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists this customer's API keys, newest first and paginated, revoked and expired ones included. The secret is never returned; `keyPrefix` and `last4` identify each key. Addresses the customer by your external customer id.
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
client.customers().listCustomerApiKeysByExternalId(
    "customer_123",
    ListCustomerApiKeysByExternalIdRequest
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

<details><summary><code>client.customers.createCustomerApiKeyByExternalId(externalId, request) -> CustomerApiKeyCreated</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an API key bound to this customer. The response carries the secret in `key`, returned only this once: store it immediately, as Paid keeps only its hash. The key acts for this customer alone: it can send signals for this customer through `POST /api/v2/signals/bulk`, and every other route refuses it. Requires `write:api-keys`, which full-access keys hold; a restricted key needs the scope granted explicitly. Addresses the customer by your external customer id.
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
client.customers().createCustomerApiKeyByExternalId(
    "customer_123",
    CreateCustomerApiKeyByExternalIdRequest
        .builder()
        .body(
            CustomerApiKeyCreate
                .builder()
                .name("Tenant runtime (production)")
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

**request:** `CustomerApiKeyCreate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.revokeCustomerApiKeyByExternalId(externalId, apiKeyId) -> CustomerApiKey</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Revokes one of this customer's keys, which then stops authenticating. Keys are never deleted: a revoked key stays listed with `revokedAt` set, and deleting the customer revokes its keys too. Revoking an already revoked key returns it unchanged. `404` when the key does not belong to this customer. Addresses the customer by your external customer id.
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
client.customers().revokeCustomerApiKeyByExternalId(
    "customer_123",
    "apiKeyId",
    RevokeCustomerApiKeyByExternalIdRequest
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

**apiKeyId:** `String` — The key's id, as returned by create or list.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.listCustomerApiKeys(id) -> CustomerApiKeyList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists this customer's API keys, newest first and paginated, revoked and expired ones included. The secret is never returned; `keyPrefix` and `last4` identify each key. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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
client.customers().listCustomerApiKeys(
    "cus_abc123",
    ListCustomerApiKeysRequest
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

<details><summary><code>client.customers.createCustomerApiKey(id, request) -> CustomerApiKeyCreated</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an API key bound to this customer. The response carries the secret in `key`, returned only this once: store it immediately, as Paid keeps only its hash. The key acts for this customer alone: it can send signals for this customer through `POST /api/v2/signals/bulk`, and every other route refuses it. Requires `write:api-keys`, which full-access keys hold; a restricted key needs the scope granted explicitly. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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
client.customers().createCustomerApiKey(
    "cus_abc123",
    CreateCustomerApiKeyRequest
        .builder()
        .body(
            CustomerApiKeyCreate
                .builder()
                .name("Tenant runtime (production)")
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

**request:** `CustomerApiKeyCreate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customers.revokeCustomerApiKey(id, apiKeyId) -> CustomerApiKey</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Revokes one of this customer's keys, which then stops authenticating. Keys are never deleted: a revoked key stays listed with `revokedAt` set, and deleting the customer revokes its keys too. Revoking an already revoked key returns it unchanged. `404` when the key does not belong to this customer. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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
client.customers().revokeCustomerApiKey(
    "cus_abc123",
    "apiKeyId",
    RevokeCustomerApiKeyRequest
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

**apiKeyId:** `String` — The key's id, as returned by create or list.
    
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

Sets the cap on this customer unit for one credits currency. Returns `changed: false` without creating a version when the effective timeline is unchanged; otherwise records a new version, preserving earlier rows. The newest version wins where they overlap. `effectiveFrom` controls applicability; `schedule` defines monthly UTC boundaries independently. Omit schedule to inherit the version covering effectiveFrom, or use the creation-time UTC day if none applies. Select the currency with `creditsCurrencyId` in the body; it may be omitted only when the organization has exactly one credits currency. A cap covers the unit and every unit beneath it, so a cap on the customer's root unit covers every unit of that customer; spend from a signal that names no unit counts toward no cap. `404` when the customer or the unit does not exist. `409` for customers on seat-based billing, a deleted unit (`CUSTOMER_UNIT_DELETED`) or a draft (`CUSTOMER_UNIT_DRAFT`). Addresses the customer by your external customer id.
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

<details><summary><code>client.customers.getCustomerUnitSpendByExternalId(externalId, externalCustomerUnitId) -> CustomerUnitSpendResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the credits of one credits currency spent by this customer unit and every unit beneath it during a window, whether or not the unit has a cap. The window runs from `start` (inclusive) to `end` (exclusive), at most 366 days; omit both for the current calendar month (UTC). For a capped unit over its cap's current period, `spent` equals the cap's `used`. Spend from a signal that names no unit counts toward no unit. Select the currency with `creditsCurrencyId`; it may be omitted only when the organization has exactly one credits currency, which is then used and echoed back. `404` when the customer or the unit does not exist. Addresses the customer by your external customer id.
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
client.customers().getCustomerUnitSpendByExternalId(
    "customer_123",
    "tenant-a",
    GetCustomerUnitSpendByExternalIdRequest
        .builder()
        .creditsCurrencyId("7f4f5d4c-55e9-4d5b-a3e7-c9eb3d2d01bf")
        .start(OffsetDateTime.parse("2026-10-01T00:00:00Z"))
        .end(OffsetDateTime.parse("2026-11-01T00:00:00Z"))
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

<dl>
<dd>

**start:** `Optional<OffsetDateTime>` — ISO 8601 timestamp, the window's inclusive start. Give `start` and `end` together, with `start` before `end`, or omit both for the current calendar month (UTC).
    
</dd>
</dl>

<dl>
<dd>

**end:** `Optional<OffsetDateTime>` — ISO 8601 timestamp, the window's exclusive end. Give `start` and `end` together, with `start` before `end`, or omit both for the current calendar month (UTC).
    
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

Sets the cap on this customer unit for one credits currency. Returns `changed: false` without creating a version when the effective timeline is unchanged; otherwise records a new version, preserving earlier rows. The newest version wins where they overlap. `effectiveFrom` controls applicability; `schedule` defines monthly UTC boundaries independently. Omit schedule to inherit the version covering effectiveFrom, or use the creation-time UTC day if none applies. Select the currency with `creditsCurrencyId` in the body; it may be omitted only when the organization has exactly one credits currency. A cap covers the unit and every unit beneath it, so a cap on the customer's root unit covers every unit of that customer; spend from a signal that names no unit counts toward no cap. `404` when the customer or the unit does not exist. `409` for customers on seat-based billing, a deleted unit (`CUSTOMER_UNIT_DELETED`) or a draft (`CUSTOMER_UNIT_DRAFT`). Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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

<details><summary><code>client.customers.getCustomerUnitSpend(id, externalCustomerUnitId) -> CustomerUnitSpendResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the credits of one credits currency spent by this customer unit and every unit beneath it during a window, whether or not the unit has a cap. The window runs from `start` (inclusive) to `end` (exclusive), at most 366 days; omit both for the current calendar month (UTC). For a capped unit over its cap's current period, `spent` equals the cap's `used`. Spend from a signal that names no unit counts toward no unit. Select the currency with `creditsCurrencyId`; it may be omitted only when the organization has exactly one credits currency, which is then used and echoed back. `404` when the customer or the unit does not exist. Use the value returned as `customer.id`, for example `cus_abc123`; if you have your own customer ID, use the `/api/v2/customers/external/{externalId}/…` twin.
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
client.customers().getCustomerUnitSpend(
    "cus_abc123",
    "tenant-a",
    GetCustomerUnitSpendRequest
        .builder()
        .creditsCurrencyId("7f4f5d4c-55e9-4d5b-a3e7-c9eb3d2d01bf")
        .start(OffsetDateTime.parse("2026-10-01T00:00:00Z"))
        .end(OffsetDateTime.parse("2026-11-01T00:00:00Z"))
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

<dl>
<dd>

**start:** `Optional<OffsetDateTime>` — ISO 8601 timestamp, the window's inclusive start. Give `start` and `end` together, with `start` before `end`, or omit both for the current calendar month (UTC).
    
</dd>
</dl>

<dl>
<dd>

**end:** `Optional<OffsetDateTime>` — ISO 8601 timestamp, the window's exclusive end. Give `start` and `end` together, with `start` before `end`, or omit both for the current calendar month (UTC).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## contacts
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

Update a contact by its ID. A contact can move to another customer only if no orders or invoices reference it; otherwise a different `customerId` returns 400 `CONTACT_CUSTOMER_IMMUTABLE`.
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

Delete a contact by its ID. A contact referenced by an order or an unsettled invoice cannot be deleted (409 `CONTACT_HAS_ASSOCIATIONS`). Posted paid invoices, voided invoices and canceled invoices do not block deletion.
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

Update a contact by its external ID. A contact can move to another customer only if no orders or invoices reference it; otherwise a different `customerId` returns 400 `CONTACT_CUSTOMER_IMMUTABLE`.
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

Delete a contact by its external ID. A contact referenced by an order or an unsettled invoice cannot be deleted (409 `CONTACT_HAS_ASSOCIATIONS`). Posted paid invoices, voided invoices and canceled invoices do not block deletion.
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

## orders
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

**paymentTerms:** `Optional<CreateOrderRequestPaymentTerms>` 
    
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

Update an order by ID. creationState must equal the order's current state; activate a draft order with POST /orders/{id}/activate.
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

**paymentTerms:** `Optional<UpdateOrderRequestPaymentTerms>` 
    
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

<details><summary><code>client.orders.upsertOrderByExternalId(request) -> ProvisionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates or updates a customer, an optional contact, the products on the order, and the order with its lines, in one call. Each record is matched by its `externalId`, so you can send the same deal again after it changes in your CRM. Returns 201 Created when the order is new, and 200 OK when an existing draft order with the same `externalId` was updated. Treat both as success. Re-provisioning an order that is already active returns 409 `ORDER_ALREADY_ACTIVE`; change an active order through the amendments API instead. Amounts are whole numbers in minor currency units (cents).
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
client.orders().upsertOrderByExternalId(
    ProvisionRequest
        .builder()
        .idempotencyKey("deal_88213-2026-09-30T14:05:00Z")
        .externalReference(
            ProvisionExternalReference
                .builder()
                .source(ProvisionExternalReferenceSource.STANDARD)
                .metadata(
                    new HashMap<String, Object>() {{
                        put("crmDealId", "deal_88213");
                        put("crmAccountId", "acct_4410");
                    }}
                )
                .build()
        )
        .customer(
            ProvisionCustomer
                .builder()
                .externalId("acct_4410")
                .name("Northwind Logistics")
                .email("billing@northwind.example")
                .billingAddress(
                    CustomerBillingAddressInput
                        .builder()
                        .line1("200 Harbor Way")
                        .city("Seattle")
                        .state("WA")
                        .zipCode("98101")
                        .country("US")
                        .build()
                )
                .build()
        )
        .order(
            ProvisionOrder
                .builder()
                .externalId("deal_88213")
                .currency("USD")
                .startDate(OffsetDateTime.parse("2026-10-01T00:00:00.000Z"))
                .lines(
                    new ArrayList<ProvisionOrderLine>(
                        Arrays.asList(
                            ProvisionOrderLine
                                .builder()
                                .externalId("deal_88213_platform")
                                .startDate(OffsetDateTime.parse("2026-10-01T00:00:00.000Z"))
                                .product(
                                    ProvisionProduct
                                        .builder()
                                        .externalId("growth_plan")
                                        .name("Growth plan")
                                        .attributes(
                                            new ArrayList<ProvisionProductAttributesItem>(
                                                Arrays.asList(
                                                    ProvisionProductAttributesItem
                                                        .builder()
                                                        .name("Platform fee")
                                                        .pricing(
                                                            ProvisionProductAttributesItemPricing
                                                                .builder()
                                                                .chargeType(ProvisionProductAttributesItemPricingChargeType.RECURRING)
                                                                .pricingModel(ProvisionProductAttributesItemPricingPricingModel.PER_UNIT)
                                                                .pricePoints(
                                                                    ProvisionProductAttributesItemPricingPricePoints
                                                                        .builder()
                                                                        .unitPrice(49900)
                                                                        .currency("USD")
                                                                        .build()
                                                                )
                                                                .billingFrequency(ProvisionProductAttributesItemPricingBillingFrequency.MONTHLY)
                                                                .billingType(ProvisionProductAttributesItemPricingBillingType.ADVANCE)
                                                                .build()
                                                        )
                                                        .build()
                                                )
                                            )
                                        )
                                        .build()
                                )
                                .build(),
                            ProvisionOrderLine
                                .builder()
                                .externalId("deal_88213_launch_discount")
                                .startDate(OffsetDateTime.parse("2026-10-01T00:00:00.000Z"))
                                .product(
                                    ProvisionProduct
                                        .builder()
                                        .externalId("launch_discount")
                                        .name("Launch discount")
                                        .attributes(
                                            new ArrayList<ProvisionProductAttributesItem>(
                                                Arrays.asList(
                                                    ProvisionProductAttributesItem
                                                        .builder()
                                                        .name("Launch discount")
                                                        .pricing(
                                                            ProvisionProductAttributesItemPricing
                                                                .builder()
                                                                .chargeType(ProvisionProductAttributesItemPricingChargeType.RECURRING)
                                                                .pricingModel(ProvisionProductAttributesItemPricingPricingModel.PER_UNIT)
                                                                .pricePoints(
                                                                    ProvisionProductAttributesItemPricingPricePoints
                                                                        .builder()
                                                                        .unitPrice(10000)
                                                                        .currency("USD")
                                                                        .build()
                                                                )
                                                                .billingFrequency(ProvisionProductAttributesItemPricingBillingFrequency.MONTHLY)
                                                                .billingType(ProvisionProductAttributesItemPricingBillingType.ADVANCE)
                                                                .build()
                                                        )
                                                        .build()
                                                )
                                            )
                                        )
                                        .build()
                                )
                                .lineType(WritableProvisionOrderLineType.CREDIT)
                                .endDate(OffsetDateTime.parse("2027-01-01T00:00:00.000Z"))
                                .build()
                        )
                    )
                )
                .name("Northwind Logistics - Growth plan")
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

**idempotencyKey:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**externalReference:** `ProvisionExternalReference` 
    
</dd>
</dl>

<dl>
<dd>

**customer:** `ProvisionCustomer` 
    
</dd>
</dl>

<dl>
<dd>

**contact:** `Optional<ProvisionContact>` 
    
</dd>
</dl>

<dl>
<dd>

**order:** `ProvisionOrder` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## invoices
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

## signals
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

<details><summary><code>client.signals.getSignalsByIds(request) -> SignalLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch up to 500 ingested signals (usage events) by ID in one request, each with the data payload submitted at ingest. Use it to resolve the `signalId` values on a page of credit transactions, or the signals behind one run or ticket, instead of calling `GET /api/v2/signals/{id}` once per signal. Signals are returned in request order; IDs that match nothing in your organization are listed under `notFound` rather than failing the request. This is a read-only operation: it requires the `read:usage` scope and is not available to customer API keys.
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
client.signals().getSignalsByIds(
    SignalLookupRequest
        .builder()
        .ids(
            new ArrayList<String>(
                Arrays.asList("6890b0e2a6f2c30012f0a1b3", "6890b0e2a6f2c30012f0a1b4")
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

**ids:** `List<String>` — Signal IDs to fetch, up to 500 per request. Duplicates are collapsed. For example the `signalId` values from a page of `GET /api/v2/credits/transactions`.
    
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

Create multiple signals (usage events) in a single request. Each signal names its customer (`customerId` or `externalCustomerId`; an alias of the customer resolves too), its customer unit (`externalCustomerUnitId`: the unit's key, or an alias that points at a unit), or both, plus an optional product attribution (`productId` or `externalProductId`). A unit alone derives the customer from the unit. A unit sent with a customer must belong to it, else the batch is refused with `400 CUSTOMER_UNIT_MISMATCH`. A unit is never named by Paid's unit id. A key or alias that matches nothing is stored without a customer, keeping the id, so it can be pointed at a unit later. An identifier is matched as a unit key first, then a customer external id, then an alias. Unit attribution is enabled per organization: where it is not, a `customerUnit` sent next to a `customer` is accepted and ignored rather than checked, as before, while a unit named alone still derives its customer. Authenticate with your organization API key, or with a customer API key (prefixed `paid_ck_live_` or `paid_ck_test_`, created with `POST /api/v2/customers/{id}/api-keys`) so a customer's own runtime can report its usage without holding your organization key. A customer API key can call this endpoint only, and only for its own customer: if any signal names another customer, or one Paid does not know, the whole batch is refused with `403` `CUSTOMER_MISMATCH` and nothing is stored. Its idempotency keys are scoped to that customer. See [Send signals with a customer API key](/documentation/signals/send-signals-with-a-customer-api-key).
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
                        .eventName("email_sent")
                        .customer(
                            CustomerAttribution.ofCustomerById(
                                CustomerById
                                    .builder()
                                    .build()
                            )
                        )
                        .attribution(
                            Attribution.ofProductById(
                                ProductById
                                    .builder()
                                    .build()
                            )
                        )
                        .timestamp(OffsetDateTime.parse("2026-01-31T23:00:00Z"))
                        .data(
                            new HashMap<String, Object>() {{
                                put("recipients", 3);
                            }}
                        )
                        .idempotencyKey("email_sent_msg_8f3a2c")
                        .build(),
                    Signal
                        .builder()
                        .eventName("email_sent")
                        .customerUnit(
                            CustomerUnitAttribution
                                .builder()
                                .externalCustomerUnitId("acme-marketing")
                                .build()
                        )
                        .idempotencyKey("email_sent_msg_9b41d7")
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

<details><summary><code>client.signals.createSignalSummaryExport(request) -> SignalSummaryExport</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Produces a usage summary file: one row per customer per month, with columns broken down by the signal payload fields you name. Choose `format` to get JSON or a wide CSV; JSON is the default. The export runs in the background, so this returns immediately with a pending export and the file appears on it once it succeeds. Give `spec` to describe the columns, or `copyFrom` with an earlier export's id to reuse that export's columns over a new window. The spec is stored on the export, so an old file can always be explained by the export that produced it. Signals are bucketed by month in UTC on their effective timestamp, the same basis billing uses, so the totals reconcile with invoices. One export runs per organization at a time.
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
client.signals().createSignalSummaryExport(
    CreateSignalSummaryExportRequest
        .builder()
        .from("2026-01-01")
        .to("2026-04-01")
        .spec(
            SignalSummarySpecInput
                .builder()
                .name("Monthly workflow usage")
                .signalNames(
                    new ArrayList<SignalSummarySignalSelection>(
                        Arrays.asList(
                            SignalSummarySignalSelection
                                .builder()
                                .name("workflow_run")
                                .group("Workflow runs")
                                .slug("runs")
                                .build()
                        )
                    )
                )
                .measures(
                    new ArrayList<SignalSummaryMeasure>(
                        Arrays.asList(
                            SignalSummaryMeasure
                                .builder()
                                .fn(SignalSummaryMeasureFn.COUNT)
                                .build()
                        )
                    )
                )
                .dimensions(
                    new ArrayList<SignalSummarySpecInputDimensionsItem>(
                        Arrays.asList(
                            SignalSummarySpecInputDimensionsItem.bands(
                                SignalSummaryBandsDimension
                                    .builder()
                                    .path("steps")
                                    .appliesTo(
                                        new ArrayList<String>(
                                            Arrays.asList("workflow_run")
                                        )
                                    )
                                    .brackets(
                                        new ArrayList<SignalSummaryBandsDimensionBracketsItem>(
                                            Arrays.asList(
                                                SignalSummaryBandsDimensionBracketsItem
                                                    .builder()
                                                    .from(1)
                                                    .upTo(10)
                                                    .slug("1_10_steps")
                                                    .group("1-10 steps")
                                                    .build(),
                                                SignalSummaryBandsDimensionBracketsItem
                                                    .builder()
                                                    .upTo(
                                                        Nullable.ofNull()
                                                    )
                                                    .slug("11_plus_steps")
                                                    .group("11+ steps")
                                                    .build()
                                            )
                                        )
                                    )
                                    .build()
                            )
                        )
                    )
                )
                .build()
        )
        .format(CreateSignalSummaryExportRequestFormat.CSV)
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

**spec:** `Optional<SignalSummarySpecInput>` 
    
</dd>
</dl>

<dl>
<dd>

**copyFrom:** `Optional<String>` — Reuse the shape of an earlier export, so a monthly run produces the same columns without restating them. Give this or spec, not both.
    
</dd>
</dl>

<dl>
<dd>

**from:** `String` — Start of the window, inclusive, snapped down to a period start. Cannot be earlier than 2025-09-01.
    
</dd>
</dl>

<dl>
<dd>

**to:** `String` — End of the window, exclusive, snapped down to a period start.
    
</dd>
</dl>

<dl>
<dd>

**customerIds:** `Optional<List<String>>` — Restrict the file to these customers. Accepts Paid IDs, UUIDs, or your external IDs. Omit for every customer.
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CreateSignalSummaryExportRequestFormat>` — Format of the produced file. `json` gives the columns and one object per customer per month; `csv` gives the wide spreadsheet with three header rows.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.signals.getSignalSummaryExport(id) -> SignalSummaryExport</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns one export with its status and the shape it ran. While it is succeeded and unexpired, each read issues a fresh short-lived download link.
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
client.signals().getSignalSummaryExport(
    "sse_5pZa1Kd8Nqx",
    GetSignalSummaryExportRequest
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

<details><summary><code>client.signals.getSignalSummary() -> SignalSummaryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Counts signals into period buckets. Use it to chart signal volume over time, split by signal name or by a signal-payload key such as team_id.

Signals count against their effective timestamp in UTC. This is the same basis billing uses, so these figures reconcile with an invoice.

The endpoint reads a pre-aggregated hourly rollup, not the raw signals. An hour is therefore the finest interval. One request may span at most 250 periods.

A grouped request keeps the 100 groups with the most signals. It sums the rest under the key "other". Each period total stays complete, but a group inside "other" loses its own figure. Read groups.truncated to learn how many groups lost it. Zero means every group kept its own figure.

Results are paged with limit and cursor. A page is never truncated in silence.

To download the series as a file, call this endpoint over HTTP with format=csv. It returns the same points as a text/csv table with a single header row. A CSV cannot carry a cursor, so a result that does not fit one page returns 400 rather than a file that is missing rows.

For a wide per-customer spreadsheet over arbitrary payload fields, use the batch export at /signals/summary/batch instead.
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
client.signals().getSignalSummary(
    GetSignalSummaryRequest
        .builder()
        .startDate("2026-08-01")
        .endDate("2026-08-31")
        .interval(GetSignalSummaryRequestInterval.DAY)
        .groupBy(GetSignalSummaryRequestGroupBy.SIGNAL_NAME)
        .limit(1000)
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

**startDate:** `String` — Window start, inclusive. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — Window end, inclusive — a date-only value means through the end of that UTC day. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**interval:** `GetSignalSummaryRequestInterval` 

Period size. Buckets align to UTC hours, calendar days, ISO weeks that start on Monday, or calendar months. An hour is the finest period available.

The first and last bucket report bounds clipped to your window.

A request may span at most 250 periods. That is about 10 days at hour, 8 months at day, and 20 years at month. A longer window returns 400 WINDOW_TOO_LARGE.
    
</dd>
</dl>

<dl>
<dd>

**customerId:** `Optional<String>` — Narrow the summary to one customer. Accepts a Paid customer ID or, as a fallback, your external customer ID. Mutually exclusive with externalCustomerId. Omit both to summarize every customer.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Your external customer ID. Mutually exclusive with customerId.
    
</dd>
</dl>

<dl>
<dd>

**signalNames:** `Optional<String>` — Narrow the summary to these signal names. Repeat the parameter for more than one. Omit to count every signal.
    
</dd>
</dl>

<dl>
<dd>

**groupBy:** `Optional<GetSignalSummaryRequestGroupBy>` 

Split each period into one series per group. signalName groups by the signal's name. dimension groups by a signal-payload key named in dimensionKey — signals per team, for example. Omit for one total per period.

A grouped request keeps the 100 groups with the most signals. It sums the rest under the key "other".

Each period total stays complete, but a group inside "other" loses its own figure. Read groups.truncated to learn how many groups lost it. To name every group, narrow the request with signalNames, customerId, or a shorter window.
    
</dd>
</dl>

<dl>
<dd>

**dimensionKey:** `Optional<String>` — The signal-payload key to group by. Required when groupBy is dimension; rejected otherwise. The key must be one your organization has declared for grouping — an undeclared key is refused rather than answered by a full scan. A signal whose payload lacks the key, or holds it empty, groups under an empty groupKey.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Maximum points to return in this page. The response is never silently truncated: when more points exist, hasMore is true and nextCursor is set.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Continue from a previous response's nextCursor. Every other parameter must be unchanged.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## credits
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

**eventName:** `Optional<String>` — Filter by the usage event that produced the transaction (exact match, untrimmed). Transactions with no event (grants, invoice-void clawbacks, manual adjustments) never match.
    
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

<details><summary><code>client.credits.getCreditTransactionSummary() -> CreditTransactionSummaryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Aggregate credit ledger transactions of one type into period buckets grouped by a dimension, for charting credit consumption over time. Accepts the same filters as the transaction list and reads the same ledger, so bucket totals always match summing that list over the same filters and the same `type` — pass this endpoint's effective `type` (it defaults to `spend`) to the list, which has no default and otherwise returns every type.
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
client.credits().getCreditTransactionSummary(
    GetCreditTransactionSummaryRequest
        .builder()
        .createdAtFrom("createdAtFrom")
        .groupBy(GetCreditTransactionSummaryRequestGroupBy.EVENT_NAME)
        .interval(GetCreditTransactionSummaryRequestInterval.DAY)
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

**type:** `Optional<GetCreditTransactionSummaryRequestType>` — Ledger type to summarize. Each call summarizes exactly one type, so a spend chart never nets grants against spends. Defaults to `spend`.
    
</dd>
</dl>

<dl>
<dd>

**orderId:** `Optional<String>` — Filter by the order this transaction is linked to.
    
</dd>
</dl>

<dl>
<dd>

**eventName:** `Optional<String>` — Filter by the usage event that produced the transaction (exact match, untrimmed). Transactions with no event (grants, invoice-void clawbacks, manual adjustments) never match.
    
</dd>
</dl>

<dl>
<dd>

**createdAtFrom:** `String` — Start of the window (inclusive). Required: the window may span at most 92 days. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**createdAtTo:** `Optional<String>` — End of the window (inclusive). Defaults to now. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**groupBy:** `GetCreditTransactionSummaryRequestGroupBy` — Dimension to group buckets by. `eventName` groups signal-driven spends by the usage event that produced them; transactions without one (grants, invoice-void clawbacks, manual adjustments) share a bucket whose `groupKey` is null.
    
</dd>
</dl>

<dl>
<dd>

**interval:** `GetCreditTransactionSummaryRequestInterval` — Period bucket size. Buckets align to UTC calendar days, ISO weeks (Monday start), or calendar months; the first and last bucket's published bounds are clipped to the requested window.
    
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

## checkouts
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

**successUrl:** `String` — Where the customer goes after paying. `{CHECKOUT_ID}` is replaced with this checkout's ID when it's created, and `{CHECKOUT_SESSION_ID}` with the customer's own checkout session ID (`cs_…`) when they start paying, so on a reusable checkout each customer returns with their own.
    
</dd>
</dl>

<dl>
<dd>

**cancelUrl:** `Optional<String>` — Where the customer goes if they leave without paying. Takes the same `{CHECKOUT_ID}` and `{CHECKOUT_SESSION_ID}` placeholders as `successUrl`.
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<OffsetDateTime>` — When the checkout link expires. Must be in the future. Defaults to 24 hours after creation.
    
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

**successTitle:** `Optional<String>` — Heading on the confirmation screen the customer sees after completing checkout, shown instead of "Payment successful". Plain text, up to 80 characters. Omit it to keep the default.
    
</dd>
</dl>

<dl>
<dd>

**successMessage:** `Optional<String>` — Text under the heading on the confirmation screen, shown instead of "Thank you for your purchase!". Plain text, up to 500 characters. Omit it to keep the default. Right after checkout, the page still adds "You will be redirected shortly." before sending the customer to `successUrl`.
    
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

Archive a checkout by ID so it can no longer be paid. A completed (paid) checkout can't be archived and returns 409.
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

## customer-portals
<details><summary><code>client.customerPortals.createCustomerPortal(request) -> CustomerPortal</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deprecated — the customer portal is being retired, and this endpoint will be removed in a future release. It keeps working for existing integrations meanwhile: it creates a portal session for the customer and returns a short-lived URL to the customer portal. Contact Paid before building anything new on it.
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

## value-receipts
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

Deprecated — use POST /value-receipts. Returns the receipt this customer already has for the date range (200), and creates one only if there is none (201), so calling twice does not give the customer two receipts. A receipt does not change after it is created, so a repeated call reports the same figures. Create a new receipt to report the period again with newer data.
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

Deprecated. A value receipt is immutable from creation, so it cannot be re-populated. A receipt you own answers 409, and one that does not exist or belongs to another organization answers 404. To get current data, create a new receipt for the period with `POST /value-receipts`.
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

Deprecated. A value receipt is immutable from creation, so it is already sealed and this call has nothing to do. It answers 200 for any receipt the organization owns.
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

Restore an archived value receipt. A receipt with no content, or one that failed to build, stays archived and answers 409. So does one whose period another value receipt now covers.
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

Make a value receipt publicly accessible via URL. An archived receipt is rejected with 409 — unarchive it first. So is one with no content, which has nothing to show.
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

**publishExpiresAt:** `Optional<OffsetDateTime>` — When the public link stops working. Must be in the future, or the request fails with 409. Omit or set null for a link that does not expire.
    
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

## delivered-value
<details><summary><code>client.deliveredValue.getDeliveredValue() -> DeliveredValueResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the value delivered to a customer over a period, computed live from your active value model on every call — per value metric: its definition, a display-ready calculation, the measured unit total, monetary total, and signal counts, plus a per-event signal breakdown. The same data a value receipt presents, without creating one — built for value dashboards and reporting. Figures always reflect the currently active value model. Shortly after you publish a model change, totals can still be priced under the previous model's rates.
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
client.deliveredValue().getDeliveredValue(
    GetDeliveredValueRequest
        .builder()
        .startDate("2026-08-01")
        .endDate("2026-08-31")
        .externalCustomerId("acme-corp")
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

**customerId:** `Optional<String>` — The customer to compute delivered value for. Accepts a Paid customer ID or, as a fallback, your external customer ID. Mutually exclusive with externalCustomerId; exactly one is required.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Your external customer ID. Mutually exclusive with customerId; exactly one is required.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Period start, inclusive. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — Period end, inclusive — a date-only value means through the end of that UTC day. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.deliveredValue.getDeliveredValueSummary() -> DeliveredValueSummaryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Aggregates delivered value into period buckets for charting value over time, grouped by value metric, by a signal-payload key (for example, value delivered per team_id), or by the formula condition band that priced each row (for example, value delivered per workflow complexity). Any grouping can be narrowed to a single value metric, which is also what lets a dimension grouping state a unit total. Reads the same rows as GET /delivered-value, so summing every bucket's monetaryTotal matches that endpoint's total for the same customer and window. Figures always reflect the currently active value model. Shortly after you publish a model change, totals can still be priced under the previous model's rates. Grouping by band reads a figure recorded when the row was priced, so value delivered before this grouping existed reports under the "none" band until a value-model backfill re-derives it.
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
client.deliveredValue().getDeliveredValueSummary(
    GetDeliveredValueSummaryRequest
        .builder()
        .startDate("2026-08-01")
        .endDate("2026-08-31")
        .groupBy(GetDeliveredValueSummaryRequestGroupBy.VALUE_METRIC)
        .interval(GetDeliveredValueSummaryRequestInterval.MONTH)
        .externalCustomerId("acme-corp")
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

**customerId:** `Optional<String>` — The customer to summarize delivered value for. Accepts a Paid customer ID or, as a fallback, your external customer ID. Mutually exclusive with externalCustomerId; exactly one is required.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Your external customer ID. Mutually exclusive with customerId; exactly one is required.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Window start, inclusive. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — Window end, inclusive — a date-only value means through the end of that UTC day. Accepts an ISO 8601 date or date-time. Date-only values (e.g. 2026-06-30) are treated as UTC; date-times without an explicit timezone offset are ambiguous, so include one (e.g. 2026-06-30T00:00:00-05:00) when precision matters.
    
</dd>
</dl>

<dl>
<dd>

**groupBy:** `GetDeliveredValueSummaryRequestGroupBy` — How to group the buckets. valueMetric groups by the value metric that delivered the money. dimension groups by a signal-payload key named in dimensionKey, summed across metrics unless valueMetric narrows it to one — for example, value delivered per team when your signals carry a team_id field. formulaCondition cuts each metric by the condition band that priced it, for a value model that prices in graduated bands — for example, value delivered per workflow complexity when the metric bands runs by step count. A band the window never hit still reports a zero in every period, so the series keeps its shape. signal groups by the source event, one row per period per signal the value model binds to a metric, summed across the metrics the signal feeds unless valueMetric narrows it to one — the per-event breakdown GET /delivered-value states for a whole window, cut into periods. A signal the window never fired still reports a zero in every period.
    
</dd>
</dl>

<dl>
<dd>

**dimensionKey:** `Optional<String>` — The signal-payload key to group by (up to 64 letters, digits, or underscores). Required when groupBy is dimension; rejected otherwise. A signal whose payload lacks the key, or holds it empty, groups under an empty groupKey.
    
</dd>
</dl>

<dl>
<dd>

**valueMetric:** `Optional<String>` — Narrow the summary to a single value metric, by slug. Every grouping accepts it: it restricts which rows are read, so the totals are that metric's alone. Under groupBy=dimension and groupBy=signal it is also what makes unitTotal stateable — one metric is one unit, where a sum across metrics is in none. Under groupBy=signal it also keeps only the signals bound to that metric as groups. An archived metric may be named; a slug the value model has never defined is rejected.
    
</dd>
</dl>

<dl>
<dd>

**interval:** `GetDeliveredValueSummaryRequestInterval` — Period bucket size. Buckets align to UTC hours, calendar days, ISO weeks (Monday start), calendar months or calendar quarters; the first and last bucket's published bounds are clipped to the requested window. The window cannot hold more than 400 buckets.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## webhooks
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
    UpdateWebhookRequestWebhookName.BILLING_INVOICE_PAID,
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

**url:** `Optional<String>` — The HTTPS endpoint Paid should deliver this webhook to. It must use HTTPS and a public host: localhost, private networks (10.x, 172.16-31.x, 192.168.x), link-local addresses and .local names are rejected. Set to null to clear it while disabled.
    
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
    TestWebhookRequestWebhookName.BILLING_INVOICE_PAID,
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

## pricing
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

## costs
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

## analytics
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

Limits: 30 seconds of execution time and 10,000 result rows (truncation is flagged via `meta.truncated`). Queries exceeding the 4 GB memory allowance return HTTP 422 with code `QUERY_MEMORY_LIMIT_EXCEEDED`. Prefer aggregates and a `created_at` date filter on large tables — this endpoint is for interactive analytics, not bulk export.
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

Lists the JSON paths (and their observed types) present in the `data` payload of your signals within a time window (default: last 30 days), grouped by signal name. Use the returned paths in queries against `fact_signal`, e.g. `WHERE data.<path>::String = '...'`. Keys declared as grouping dimensions are marked `declared` with their `slot` and listed first. Where available, each path also carries `firstSeen`, `lastSeen` and a `signals` count; these span all time, and the window only selects which paths and types are returned.
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

## custom-views-experimental
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

**hierarchyEnabled:** `Optional<Boolean>` — Enable customer unit navigation for a customer-scoped view. Setting true requires customer hierarchies to be enabled for your organization, and every query must support unit selection. Existing views default to false.
    
</dd>
</dl>

<dl>
<dd>

**capsEnabled:** `Optional<Boolean>` — Send the customer's unit caps to the render bundle as `context.caps`. Needs `hierarchyEnabled` on a customer-scoped view. Turn it on only for views that draw cap usage: each load then reads cap usage from billing. Caps are spend policy, so an API key also needs `read:billing` to receive them in the data (they are left out otherwise) or to mint this view's embed token. Defaults to false.
    
</dd>
</dl>

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

Returns the view's name, status, query ids, and the author render bundle for the owning organization. Only PUBLISHED views are returned; a DRAFT returns 404 (use getCustomViewAuthoring to read a DRAFT). Used by the trusted preview/embed frame to render the sandbox; the per-customer data is fetched separately via /:displayId/data.
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

Partially updates a view. Omitted fields are left unchanged. For REVISIONS, prefer the incremental fields — `bundleEdits` (exact search-and-replace on the stored render bundle) and `queryUpserts`/`queryRemovals` (per-query changes) — so you transmit only what changed instead of re-sending the whole payload. The full-replacement fields remain for rewrites: `renderBundle`, and `queries` (a FULL replacement of the query list — never drop queries the user didn't ask to remove). Replacement and incremental forms of the same aspect cannot be combined. The resulting SQL and bundle pass the same validation as createCustomView (SELECT-only, size cap, self-contained, paid:data listener). Works on DRAFT or PUBLISHED views — published embeds pick the change up on their next load. If the queries or hierarchy setting change during validation, returns 409 CUSTOM_VIEW_UPDATE_CONFLICT; fetch the current authoring definition and reapply your changes before retrying.
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

**hierarchyEnabled:** `Optional<Boolean>` — Enable customer unit navigation for a customer-scoped view. Setting true requires customer hierarchies to be enabled for your organization, and every query must support unit selection. Existing views default to false.
    
</dd>
</dl>

<dl>
<dd>

**capsEnabled:** `Optional<Boolean>` — Send the customer's unit caps to the render bundle as `context.caps`. Needs `hierarchyEnabled` on a customer-scoped view. Turn it on only for views that draw cap usage: each load then reads cap usage from billing. Caps are spend policy, so an API key also needs `read:billing` to receive them in the data (they are left out otherwise) or to mint this view's embed token. Defaults to false.
    
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

<details><summary><code>client.customViewsExperimental.getCustomViewCustomerUnits(displayId) -> ViewCustomerUnitsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **Experimental** — this endpoint may change or be removed without notice and is not subject to v2 backwards-compatibility guarantees. Do not build production-critical integrations against it yet.

Lists active customer units for a published customer-scoped view with hierarchyEnabled set to true. Hierarchy eligibility is independent of the requested page or usage; requires credit hierarchies to be enabled for the organization.
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
client.customViewsExperimental().getCustomViewCustomerUnits(
    "displayId",
    GetCustomViewCustomerUnitsRequest
        .builder()
        .customerId("cus_acme")
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

**customerId:** `String` — The customer's external ID, Paid customer ID, or internal ID.
    
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

Runs every stored query of the view on the read-only analytics database and returns the result sets keyed by query id. For a customer-scoped view (the default), the query is scoped to the caller's organization AND the given `customerId` (both enforced as ClickHouse row filters) — `customerId` is required. For an organization-scoped view, the data is org-wide (scoped only to the caller's organization) and `customerId` is ignored. The scope is enforced by the database — it cannot be widened by the stored SQL. If the view declares filters, pass per-request values as `filter_<name>` query parameters (e.g. `filter_region=eu`); undeclared names or disallowed values are rejected with 400. Filters narrow data within the scope — never widen it. Only PUBLISHED views are served by default; a DRAFT returns 404. To check a saved DRAFT's real data before publishing, pass `includeDraft=true`. Embeds and share links never serve a DRAFT.
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

<dl>
<dd>

**includeDraft:** `Optional<GetCustomViewDataRequestIncludeDraft>` — Pass 'true' to also serve a DRAFT view, so you can check its real data before publishing. Without it a DRAFT returns 404. End-customer embeds and share links never serve a DRAFT.
    
</dd>
</dl>

<dl>
<dd>

**unitMode:** `Optional<GetCustomViewDataRequestUnitMode>` — Unit selection for this request. Omit both unit parameters for all customer activity. Shared links instead use their saved starting selection when omitted; pass all to reset a shared link.
    
</dd>
</dl>

<dl>
<dd>

**unitExternalId:** `Optional<String>` — The unit's external ID. Required with direct or subtree, and omitted with all.
    
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

## value-models
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

Uploads a new value model version. Validates the content, creates a new version, archives the previous active version, and syncs to ClickHouse. This updates how value is calculated going forward — new signals are valued under the new model. It does NOT re-rate historical signals; run POST /api/v2/value-models/backfill to re-rate history as a separate, explicit action. Any unpublished draft saved in the Paid app is discarded. Send expectedActiveVersion to get a 409 instead of overwriting a version published since you read it.
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

<dl>
<dd>

**expectedActiveVersion:** `Optional<Integer>` — Optimistic concurrency guard: the active version this upload is based on. When supplied and it does not match the live active version, the upload fails with 409 instead of overwriting a concurrent change.
    
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

Manually triggers a recalculation of all ClickHouse rows against the current value model. Returns 422 when the backfill would scan more signals than the ceiling allows — that is deterministic, so retrying without narrowing the scope will not help.
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

## value-metrics
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

Adds one value metric — its unit, formula, signal binding and optional monetary conversion — to the value model. The signal must already exist: an event name your organization has sent, or one referenced by usage pricing on an active product. Publishes a new value model version that values NEW signals going forward; it does NOT recalculate historical delivered value. Re-rating history is a separate, explicit action (POST /api/v2/value-models/backfill).
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

## payment-methods
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

## payments
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

**currency:** `String` — Three-letter ISO 4217 currency code. Lowercase is accepted and stored upper-cased.
    
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

## payment-allocations
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

Allocates a payment across one or more invoice lines of posted invoices, in the payment's currency. When an invoice becomes fully paid, its credit entitlements are processed. Returns 409 when a concurrent allocation has already spent the balance.
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

## amendments
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

## analytics-experimental
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

Limits: 30 seconds of execution time and 10,000 result rows (truncation is flagged via `meta.truncated`). Queries exceeding the 4 GB memory allowance return HTTP 422 with code `QUERY_MEMORY_LIMIT_EXCEEDED`. Prefer aggregates and a `created_at` date filter on large tables — this endpoint is for interactive analytics, not bulk export.
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

Lists the JSON paths (and their observed types) present in the `data` payload of your signals within a time window (default: last 30 days), grouped by signal name. Use the returned paths in queries against `fact_signal`, e.g. `WHERE data.<path>::String = '...'`. Keys declared as grouping dimensions are marked `declared` with their `slot` and listed first. Where available, each path also carries `firstSeen`, `lastSeen` and a `signals` count; these span all time, and the window only selects which paths and types are returned.
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

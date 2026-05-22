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

Creates a new product for the organization
</dd>
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

Update a product by ID. Optionally upsert product attributes with pricing.
</dd>
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

Update a product by external ID. Optionally upsert product attributes with pricing.
</dd>
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

List credit currencies for the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credits().listCreditCurrencies();
```
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

**currency:** `Optional<String>` — Lock checkout to a specific currency. Omit to allow all currencies supported by the selected plans.
    
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
<details><summary><code>client.valueReceipts.syncValueReceipt(request) -> ValueReceiptSyncResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Find or create a value receipt by natural key (customer + product/order + dates), then populate it with current data inline. Returns the ID, status, and public URL. Posted (sealed) VRs are returned as-is without re-populating.
</dd>
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

**customerId:** `Optional<String>` — Mutually exclusive with externalCustomerId. Exactly one is required.
    
</dd>
</dl>

<dl>
<dd>

**externalCustomerId:** `Optional<String>` — Mutually exclusive with customerId. Exactly one is required.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `OffsetDateTime` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `OffsetDateTime` 
    
</dd>
</dl>

<dl>
<dd>

**product:** `Optional<SyncValueReceiptRequestProduct>` — Mutually exclusive with orderId. Provide at most one.
    
</dd>
</dl>

<dl>
<dd>

**orderId:** `Optional<String>` — Mutually exclusive with product. Provide at most one.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

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

Make a value receipt publicly accessible via URL.
</dd>
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

Revoke public access to a value receipt.
</dd>
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

Updates pricing on an existing product attribute. If creditBenefits is provided, it fully replaces existing benefits. If omitted, existing benefits are preserved.
</dd>
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
                                    .unitPrice(1.1)
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

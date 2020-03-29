**Advanced Autowiring**

**AutoWiring by Type**

-   The Bean for specific types are searched. If more than one bean is found,
    then to resolve ambiguity the bean with higher preference need to be
    annotated with \@Primary.

-   \@Profile and \@Primary are mutually exclusive.

- https://stackoverflow.com/questions/60915199/understanding-primary-annotation-in-profile

**AutoWiring by Name**

The default bean name is the name of method; a custom name can also be specified
using Qualifier name.

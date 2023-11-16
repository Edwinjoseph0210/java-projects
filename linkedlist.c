#include<stdio.h>
#include<stdlib.h>

struct node
    {
        int data;
        struct node* next;

    };
    struct node *head, *ptr, *temp, *newnode;


void insertbeginning()
    {
        newnode=(struct node*) malloc (sizeof(struct node));
        printf("Enter the element to be added: ");
        scanf("%d",&newnode->data);
        if(head==NULL)
            {
                newnode->next = NULL;
                head=newnode;
            }
        else
            {
                newnode->next = head;
                head=newnode;
            }

    }
void insertend()
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("Enter the element to be added");
        scanf("%d",&newnode->data);
        temp=head;
        while(temp->next!=NULL)
            {
                temp=temp->next;
            }
        temp->next=newnode;
        newnode->next=NULL;
    }
void insertany() 
    {
        int pos;
        printf("Enter the position where the element is to be added: ");
        scanf("%d", &pos);

        newnode = (struct node*)malloc(sizeof(struct node));
        printf("Enter the element to be added: ");
        scanf("%d", &newnode->data);

        temp = head;

        if (pos == 1) 
            {
                newnode->next = head;
                head = newnode;
                return;
            }

        for (int i = 1; i < pos - 1 && temp != NULL; i++) 
            {
                temp = temp->next;
            }

        if (temp == NULL) 
            {
                printf("Invalid position.\n");
                return;
            }
    }
void deletebeginning()
    {
        if(head->next==NULL)
            {
                temp=head;
                head=NULL;
                printf("\nThe deleted element is: %d",temp->data);
                free(temp);
            }
        else if(head==NULL)   
            {
                printf("\nEmpty list");
            }
        else
            {
                temp=head;
                head=head->next;
                printf("\nDeleted element is: %d",temp->data);
                free(temp);
            }
    }
void deleteend()
    {
        if(head->next==NULL)
            {
                temp=head;
                head=NULL;
                printf("\nThe deleted element is: %d",temp->data);
                free(temp);
            }
        else if(head==NULL)
            {
                printf("\nEmpty");
            }
        else    
            {
                temp=head;
                ptr=temp->next;
                while(ptr->next!=NULL)
                    {
                        ptr=ptr->next;
                        temp=temp->next;
                    }
                printf("\nDeleted element is: %d",ptr->data);
                free(ptr);
            }
    }
void deleteany()
    {
        int pos;
        printf("Enter the position from where the element is to be deleted");
        scanf("%d",&pos);
        if(pos==1 && head==NULL)
            {
                temp=head;
                head=NULL;
                printf("\nThe deleted element is: %d",temp->data);
                free(temp);
            }
        else if(head==NULL)
            {
                printf("\nEmpty");
            }
        else if(pos==1)   
            {
                temp=head;
                head=head->next;
                printf("\nDeleted element is: %d",temp->data);
                free(temp);
            }
        else
            {
                temp=head;
                int i=0;
                for(i=0;i<pos-1;i++)
                    {
                        temp=temp->next;
                    }
                ptr=temp->next;
                temp->next=ptr->next;
                printf("\n Deleted element is: %d",ptr->data);
                free(ptr);
            }
    }
void display()
    {
        if(head==NULL)
            {
                printf("\nEmpty");
            }
        else
            {
                printf("\nThe elements in the list are:");
                for(temp=head;temp!=NULL;temp=temp->next)
                    {
                        printf("\t%d",temp->data);
                    }
                printf("\n");
            }
    }

int main()
    {
        int n,i=1;
        printf("Enter the operation to be done.\n");
        while(i!=0)
        {
            printf("1:Insertion at beginning.\n2:Insertion at end.\n3.Insertion at any position.\n4.Deletion from beginng.\n5.Deletion from end.\n6.Deletion from any position.\n7.Display the list.\nChoice:");
            scanf("%d",&n);
            switch(n)
                {
                    case 1:
                        printf("Inserting the element at the beginning\n");
                        insertbeginning();
                        break;

                    case 2:
                        printf("Inserting the element at the end\n");
                        insertend();
                        break;

                    case 3:
                        printf("Inserting the element at the required position\n");
                        insertany();
                        break;

                    case 4:
                        printf("Deleting the element from the beginning\n");
                        deletebeginning();
                        break;

                    case 5:
                        printf("Deleting the element from the end\n");
                        deleteend();
                        break;

                    case 6:
                        printf("Deleting the element from the entered position\n");
                        deleteany();
                        break;

                    case 7:
                        printf("The final linked list is: ");
                        display();
                        break;

                    default:
                        printf("Invalid choice\n");

                }
        i++;
        }
    }
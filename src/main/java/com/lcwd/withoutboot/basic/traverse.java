package com.lcwd.withoutboot.basic;


    class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public class traverse{

        // Inorder Traversal
        static void inorder(Node root) {

            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Preorder Traversal
        static void preorder(Node root) {

            if (root == null)
                return;

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Postorder Traversal
        static void postorder(Node root) {

            if (root == null)
                return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void main(String[] args) {

            // Create Nodes
            Node root = new Node(50);

            Node n1 = new Node(30);
            Node n2 = new Node(70);
            Node n3 = new Node(20);
            Node n4 = new Node(40);
            Node n5 = new Node(60);
            Node n6 = new Node(80);

            // Connect Nodes
            root.left = n1;
            root.right = n2;

            n1.left = n3;
            n1.right = n4;

            n2.left = n5;
            n2.right = n6;

            // Traversals
            System.out.print("Inorder : ");
            inorder(root);

            System.out.println();

            System.out.print("Preorder : ");
            preorder(root);

            System.out.println();

            System.out.print("Postorder : ");
            postorder(root);
        }
    }









